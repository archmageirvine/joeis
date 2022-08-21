package irvine.oeis.a342;

import java.util.Arrays;
import java.util.function.BiFunction;

import irvine.math.LongUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002712;

/**
 * A342053 Array read by antidiagonals: T(n,k) is the number of unrooted 3-connected triangulations of a disk with n interior nodes and k nodes on the boundary, n &gt;= 1, k &gt;= 3.
 * @author Sean A. Irvine
 */
public class A342053 implements Sequence {

  // After Andrew Howroyd

  // References
  // William G. Brown, Enumeration of Triangulations of the Disk, Proc. Lond. Math. Soc. s3-14 (1964) 746-768.
  // William T. Tutte, A census of planar triangulations, Canad. J. Math. 14 (1962), 21-38. See Eq. 5.12.

  // This script is for the arrays A341923 and A342053.

  // This script is for 3-connected triangulations of a disk. Brown's paper mostly covers the 2-connected case.
  // In the final section (section IV) he briefly describes how to extend the results to 3-connected, but is
  // short on detail. He also mentions that a direct route is probably much harder. The basic principle is
  // that to every 2-connected triangulation one can associate a 3-connected core. Substituting the edges on
  // the boundary of a 3-connected triangulation with possibly empty rooted 2-triangulations gives the
  // 2-connected triangulations associated with the 3-connected triangulation. Series reversion can be
  // used to reverse this process.

  // In the bivariate power series used here, x counts the external vertices (or edges) and y counts the
  // internal vertices. This is the opposite to the Brown paper. The reason for this is that PARI
  // does series reversion only on the primary series variable - in this case we are considering
  // substitutions on the external edges.

  // See also PARI script in A169808 which is the for the 2-connected case.

  private static final PolynomialRingField<Z> INNER = new PolynomialRingField<>("y", IntegerField.SINGLETON);
  static final PolynomialRingField<Polynomial<Z>> RING = new PolynomialRingField<>(INNER);
  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private static final Polynomial<Polynomial<Z>> X3 = RING.monomial(INNER.one(), 3);
  private static final Polynomial<Z> NEG_ONE = INNER.negate(INNER.one());
  private static final Polynomial<Z> TWO = INNER.monomial(Z.TWO, 0);
  private static final Polynomial<Z> Y2 = INNER.monomial(Z.ONE, 2);

  private static PolynomialRingField<Polynomial<Z>> r(final int n) {
    return new PolynomialRingField<>(new DegreeLimitedPolynomialRingField<>("y", IntegerField.SINGLETON, n));
  }

  // Rooted disk triangulations

  // A146305: Biconnected with n internal nodes and m+3 external nodes.
  final BiFunction<Integer, Integer, Z> mD = (n, m) -> F.factorial(2 * m + 3).multiply(F.factorial(4 * n + 2 * m + 1)).multiply2()
    .divide(F.factorial(m).multiply(F.factorial(m + 2)).multiply(F.factorial(n)).multiply(F.factorial(3 * n + 2 * m + 3)));

  // A341856: 3-connected
  final BiFunction<Integer, Integer, Z> mW = (n, m) -> m == 0
    ? F.factorial(4 * n + 1).multiply2().divide(F.factorial(3 * n + 2).multiply(F.factorial(n + 1)))
    : F.factorial(m + 2).multiply(F.factorial(m - 1).multiply(3))
    .multiply(Integers.SINGLETON.sum(0, Math.min(m, n - 1), j -> F.factorial(4 * n + 3 * m - j + 1).multiply(m + j + 2).multiply(m - 3L * j).divide(F.factorial(j).multiply(F.factorial(j + 1)).multiply(F.factorial(m - j)).multiply(F.factorial(m - j + 2)).multiply(F.factorial(n - j - 1))))).divide(F.factorial(3 * n + 3 * m + 3));

  // Triangulations with Rotational Symmetry
  final BiFunction<Integer, Integer, Z> mEr = (s, p) -> F.factorial(2 * p + 2).multiply(F.factorial(4 * s + 2 * p + 1))
    .divide(F.factorial(p).multiply(F.factorial(p + 1)).multiply(F.factorial(s)).multiply(F.factorial(3 * s + 2 * p + 2)));

  // E3(s,p)={(2*p+1)!*(4*s+2*p)!/(p!*p!*s!*(3*s+2*p+1)!)}
  final BiFunction<Integer, Integer, Z> mE3 = (s, p) -> F.factorial(2 * p + 1).multiply(F.factorial(4 * s + 2 * p))
    .divide(F.factorial(p).square().multiply(F.factorial(s)).multiply(F.factorial(3 * s + 2 * p + 1)));

  @FunctionalInterface
  interface TriFunction<A, B, C, R> {
    R apply(final A s, final B j, final C p);
  }

  // E2(s,j,p)=2*(2*p)!*(4*s+2*p+2*j-1)!/(p!*(p-1)!*s!*(3*s+2*p+2*j)!)
  final TriFunction<Integer, Integer, Integer, Z> mE2 = (s, j, p) -> F.factorial(2 * p).multiply(F.factorial(4 * s + 2 * p + 2 * j - 1)).multiply2()
    .divide(F.factorial(p).multiply(F.factorial(p - 1)).multiply(F.factorial(s)).multiply(F.factorial(3 * s + 2 * p + 2 * j)));

// // Oriented triangulations.
// // See 6.3 in Brown.
// // A262586: 2-connected
// OrientedTriangs(n,m)={(D(n,m) + if(m%2==1, E2(n\2, n%2, (m+1)/2)) + if(gcd(m,n)%3==0, 2*E3(n/3, m/3)) + sumdiv(gcd(m+3,n-1), d, if(d>2, eulerphi(d)*Er((n-1)/d, (m+3)/d-1))))/(m+3)}
// 
// // Helper to make matrix from bivariate g.f.
// BgfToArray(gf, N, M)={matrix(N+1, M+1, n, m, polcoeff(polcoeff(gf, n-1, x), m-1, y))}


  // Helper to make bivariate g.f. from a function. Transposes function.
  Polynomial<Polynomial<Z>> makeSquareBgfTr(final BiFunction<Integer, Integer, Z> fun, final int n, final int m, final int yStep) {
    final Polynomial<Polynomial<Z>> sum = RING.empty();
    for (int k = 0; k <= n; ++k) {
      final Polynomial<Z> s = INNER.empty();
      for (int j = 0; j <= m; ++j) {
        s.add(fun.apply(j, k));
        for (int i = 1; i < yStep; ++i) {
          s.add(Z.ZERO);
        }
      }
      sum.add(s);
    }
    return sum;
  }

  // Substitutes x with x^e and y with y^e in s.
  private Polynomial<Polynomial<Z>> bgfRaise(final Polynomial<Polynomial<Z>> s, final int e) {
    return RING.deepSubstitute(s, e);
  }

  // Does an inversion for rotational symmetry.
  // The functional equation we are inverting is:
  //      P(x,y) = F'(x,y) * Z(F(x,y), y)
  // where P(x,y) give the number of 2-connected triangulations with some rotational symmetry
  // and Z(x,y) is the corresponding number of 3-connected triangulations that we wish to calculate.
  // Here F(x,y) gives the number of possibly empty triangulations rooted at an edge.
  // F(x,y) is in Brown's paper x*(1 + x*D(y,x)) = x*Dbar(y,x).
  // Note F'(x,y) is d/dx of F(x,y)
  // To invert this we integrate both sides applying the chain rule and then use Lagrangian inversion.
  // The method parameters are bgf=P(x,y) and Fi(x,y) the series reversion of F(x,y).
  Polynomial<Polynomial<Z>> invHelp(final int m, final Polynomial<Polynomial<Z>> bgf, final Polynomial<Polynomial<Z>> fi) {
    // Intermediate result here is rational, so need to promote to over Q
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, m));
    return PolynomialUtils.qxToZx(ring.diff(ring.substitute(ring.integrate(PolynomialUtils.zxToQx(bgf)), PolynomialUtils.zxToQx(fi), bgf.degree() + 1)));
  }

  // Main method for oriented triangulations - returns bivariate g.f.
  Polynomial<Polynomial<Z>> orientedStrongTriangsGf(final int m, final int n) {
    final PolynomialRingField<Polynomial<Z>> ring = r(n);
    final Polynomial<Polynomial<Z>> fi = bgfTrim(ring.reversion(ring.add(ring.x(), makeSquareBgfTr(mD, m / 2, n / 2, 1).shift(2)), m), m, n / 2);
    final Polynomial<Polynomial<Z>> gr = invHelp(n / 3, makeSquareBgfTr(mEr, m / 3, n / 3, 1), fi).shift(1);
    final Polynomial<Polynomial<Z>> a = makeSquareBgfTr(mW, m - 3, n, 1).shift(3);
    final Polynomial<Polynomial<Z>> b = bgfRaise(invHelp(n / 2, ring.add(ring.one(), makeSquareBgfTr((s, q) -> mE2.apply(s, 0, q + 1), m / 2, n / 2, 1).shift(1)), fi).shift(1), 2);
    final Polynomial<Polynomial<Z>> c = PolynomialUtils.innerShift(ring, bgfRaise(invHelp(n / 2, makeSquareBgfTr((s, q) -> mE2.apply(s, 1, q + 1), m / 2, n / 2, 1).shift(1), fi).shift(1), 2), 1);
    final Polynomial<Polynomial<Z>> d = ring.multiply(bgfRaise(invHelp(n / 3, makeSquareBgfTr(mE3, m / 3, n / 3, 1), fi).shift(1), 3), TWO);
    final Polynomial<Polynomial<Z>> e = PolynomialUtils.innerShift(ring, ring.sum(3, m, k -> ring.multiply(bgfRaise(bgfTrim(gr, m / k + 1, n / k + 1), k), Polynomial.create(LongUtils.phi(k)))), 1);
    final Polynomial<Polynomial<Z>> p = ring.add(a, b, c, d, e);
    return ring.integrate(ring.subtract(p.shift(-1), ring.x())).truncate(m);
  }

  // Sequences for OrientedStrongTriangsGf.
  // A341923Array(N,M)={BgfToArray(OrientedStrongTriangsGf(M+2,N)/(y*x^3), M-1, N-1)~}

  protected Z a341923(final int n, final int k) {
    return orientedStrongTriangsGf(k + 3, n).coeff(k + 3).coeff(n);
  }

  protected Polynomial<Z> a341923ColSeq(final int n, final int k) {
    return RING.subtract(orientedStrongTriangsGf(k, n), X3).coeff(k);
  }

// A341923RowSeq(N,k)={Vec(polcoeff(OrientedStrongTriangsGf(N,k), k, y))}
// A341923AntidiagonalSums(N)=Vec(subst(OrientedStrongTriangsGf(N+3,N), y, x)-x^3)

  // Triangles with Reflection symmetry.

  // Trims a bivariate g.f. to required precision (both x and y)
  private Polynomial<Polynomial<Z>> bgfTrim(final Polynomial<Polynomial<Z>> s, final int n, final int m) {
    final Polynomial<Polynomial<Z>> res = RING.empty();
    for (int k = 0; k < Math.min(s.size(), n); ++k) {
      res.add(s.coeff(k).truncate(m));
    }
    return res;
  }


  // J_0 function (sequence A002712 as g.f.)
  // See 13.10: Satisfies J = 1 + x*J + x^2*J*(1 + x*J/2)*(J^2 - D(x^2,0)).
  // Compute by iteratively growing precision.
// Jgf(n,x='x)={my(q=Ser(vector(n+1, i, if(i%2, D(i\2,0))), x), p=1+O(x)); for(n=1, n, p = 1 + x*p + x^2*p*(1 + x*p/2)*(p^2 - q)); p}

  private final MemorySequence mJ = MemorySequence.cachedSequence(new A002712());

  Polynomial<Z> jgf(final int n) {
    mJ.a(n); // Force enough terms
    return INNER.create(mJ);
  }


  // Q1, Q2, Q3: The first is for an odd number of external vertices, the other two are for even.
  //   __        ___         __
  //  |   \     |   |      /    \
  //  |__ /     |___|      \ __ /
  // These have respectively 1, 0 and 2 external vertices on the symmetry line.
  // The relation of these to K(x,y) and L(x,y) given by Brown follows.
  // Let P1(x,y) be even terms of K(y,x) or even terms of L(y,x), P2(x,y) be odd terms of K(y,x) and P3(x,y) be odd terms of L(y,x).
  // More precisely 2*P1(x^2,y) = K(y,x) + K(y,-x) = L(y,x) + L(y,-x); 2*x*P2(x^2,y) = K(y,x) - K(y,-x); 2*x*P3(x^2,y) = L(y,x) - L(y,-x).
  // P1, P2, P3 enumerate 2-connected triangulations with reflection symmetry with the types shown above.
  // Q1, Q2, Q3 will enumerate the same triangulations but without edges that cross the symmetry line
  // or in the case of Q3 join the two external vertices on the symmetry line.
  // These are related to P1, P2, P3 by the following:
  //    Q1 = P1/(1 + x*P2); Q2 = P2/(1 + x*P2); Q3 = P3 - P1*Q1 - (D-1)/x.
  // The following functions give Q1, Q2, Q3 in terms of D,J,x,y (see Brown/A169808/below for meaning of D/J)
  // In the case of Q2 and Q3 we actually multiply by an extra x to keep denominators consistent.

  // Q1(D,J,x,y)={(y^3*J^2 + y^2*J - x)*D/(y*(y^2*J + x)*D + (-x + y^2))}
  Polynomial<Polynomial<Z>> q1(final Polynomial<Polynomial<Z>> d, final Polynomial<Z> j) {
    final Polynomial<Polynomial<Z>> t = RING.create(Arrays.asList(
      INNER.add(j.shift(2), INNER.multiply(j, j, j.degree()).shift(3)),
      NEG_ONE
    ));
    final Polynomial<Polynomial<Z>> num = RING.multiply(t, d);
    final Polynomial<Polynomial<Z>> u = RING.create(Arrays.asList(j.shift(3), INNER.x()));
    final Polynomial<Polynomial<Z>> v = RING.create(Arrays.asList(Y2, NEG_ONE));
    final Polynomial<Polynomial<Z>> den = RING.add(RING.multiply(u, d, d.degree()), v);
    final PolynomialRingField<Polynomial<Z>> ring = r(j.degree());
    return ring.series(num, den, d.degree());
  }

  // Q2(D,J,x,y)={(((-y^2*x + y^3)*J - y*x)*D + (y*x - y^3)*J) / (y*(y^2*J + x)*D + (-x + y^2))}
  Polynomial<Polynomial<Z>> q2(final Polynomial<Polynomial<Z>> d, final Polynomial<Z> j) {
    final Polynomial<Polynomial<Z>> t = RING.create(Arrays.asList(
      Polynomial.create(0, 0, 0, 1),
      INNER.negate(Y2)
    ));
    final Polynomial<Polynomial<Z>> t1 = RING.subtract(RING.multiply(t, j), RING.monomial(INNER.x(), 1));
    final Polynomial<Polynomial<Z>> w = RING.create(Arrays.asList(INNER.negate(j.shift(3)), j.shift(1)));
    final Polynomial<Polynomial<Z>> num = RING.add(RING.multiply(t1, d, d.degree()), w);
    final Polynomial<Polynomial<Z>> u = RING.create(Arrays.asList(j.shift(3), INNER.x()));
    final Polynomial<Polynomial<Z>> v = RING.create(Arrays.asList(Y2, NEG_ONE)); // todo constant
    final Polynomial<Polynomial<Z>> den = RING.add(RING.multiply(u, d, d.degree()), v);
    final PolynomialRingField<Polynomial<Z>> ring = r(j.degree());
    return ring.series(num, den, num.degree());
  }

  // Q3(D,J,x,y)={(((-y^2*x*J - x^2)*D + (y^2*x*J^2 + y*x*J - y*x))/(y*(y^2*J + x)*D + (-x + y^2)) - 1)*D + 1}
  Polynomial<Polynomial<Z>> q3(final Polynomial<Polynomial<Z>> d, final Polynomial<Z> j) {
    final Polynomial<Polynomial<Z>> t = RING.create(Arrays.asList(
      INNER.zero(),
      INNER.negate(j.shift(2)),
      NEG_ONE
    ));
    final Polynomial<Polynomial<Z>> w = RING.monomial(INNER.add(INNER.multiply(j, j, j.degree()).shift(2), j.shift(1), INNER.negate(INNER.x())), 1);
    final Polynomial<Polynomial<Z>> num = RING.add(RING.multiply(t, d, d.degree()), w);
    final Polynomial<Polynomial<Z>> u = RING.create(Arrays.asList(j.shift(3), INNER.x()));
    final Polynomial<Polynomial<Z>> v = RING.create(Arrays.asList(Y2, NEG_ONE)); // todo constant
    final Polynomial<Polynomial<Z>> den = RING.add(RING.multiply(u, d, d.degree()), v);
    final PolynomialRingField<Polynomial<Z>> ring = r(j.degree());
    return RING.add(RING.multiply(RING.subtract(ring.series(num, den, d.degree()), RING.one()), d, d.degree()), RING.one());
  }

  // Main method for achiral triangulations - returns bivariate g.f.
  Polynomial<Polynomial<Z>> achiralStrongTriangsGf(final int m, final int n) {
    final PolynomialRingField<Polynomial<Z>> ring = r(2 * n + 1);
    final Polynomial<Polynomial<Z>> ds = RING.add(RING.one(), makeSquareBgfTr(mD, m - 1, n + m - 1, 2).shift(1));
    final Polynomial<Polynomial<Z>> fi = bgfRaise(ring.reversion(RING.add(RING.x(), makeSquareBgfTr(mD, m, n, 1).shift(2)), m + 2), 2);
    final Polynomial<Z> j = jgf(2 * (n + m));
    final Polynomial<Polynomial<Z>> q1 = bgfTrim(q1(ds, j), m + 1, 2 * n + 1);
    final Polynomial<Polynomial<Z>> q2 = bgfTrim(RING.leftTruncate(q2(ds, j), 1), m + 1, 2 * n + 1);
    final Polynomial<Polynomial<Z>> q3 = bgfTrim(RING.leftTruncate(q3(ds, j), 1), m + 1, 2 * n + 1);
    final Polynomial<Polynomial<Z>> a = RING.subtract(RING.substitute(q1.shift(1), fi, Integer.MAX_VALUE).shift(1), X3);
    return RING.add(a, ring.divide(RING.add(
          RING.substitute(q2, fi, j.degree()).shift(2),
          RING.substitute(q3.shift(1), fi, j.degree())),
        TWO));
  }

  // Sequences for unrooted triangulations
// A342053Array(N,M)={(BgfToArray(AchiralStrongTriangsGf(M\2, (N+1)\2)/(y*x^3), M-1, N-1)~ + A341923Array(N,M))/2}

  protected Z a342053(final int n, final int kk) {
    final int k = kk + 3;
    return achiralStrongTriangsGf(Math.max(0, k / 2 - 1), (n + 1) / 2).coeff(k).coeff(n).add(a341923(n, kk)).divide2();
  }

// A342053ColSeq(N,k)={(Vec(O(y*y^N) + polcoeff(AchiralStrongTriangsGf(max(0,k\2-1),(N+1)\2),k), N) + A341923ColSeq(N,k))/2}

  protected Polynomial<Z> a342053ColSeq(final int n, final int k) {
    return INNER.divide(INNER.add(achiralStrongTriangsGf(Math.max(0, k / 2 - 1), (n + 1) / 2).coeff(k), a341923ColSeq(n, k)), Z.TWO);
  }

  // A342053RowSeq(N,k)={(Vec(O(x*x^N) + polcoeff(AchiralStrongTriangsGf(N\2-1, (k+1)\2), k, y)) + A341923RowSeq(N,k))/2}
// A342053AntidiagonalSums(N)={(Vec(O(x^(N+4)) + subst(AchiralStrongTriangsGf((N+1)\2,(N+1)\2), y, x)) + A341923AntidiagonalSums(N))/2}

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return a342053(mM, mN - mM);
  }
}
