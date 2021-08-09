package irvine.oeis.a050;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.RationalFunction;
import irvine.math.polynomial.RationalFunctionField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050203 a(n) is the coefficient of the term a^(-n) in the asymptotic series for the least positive zero of the generalized Rogers-Ramanujan continued fraction.
 * @author Sean A. Irvine
 */
public class A050203 implements Sequence {

  // After Kok Seng Chua

  private static final PolynomialRingField<Q> RING_Q = new PolynomialRingField<>("q", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING_X = new PolynomialRingField<>(RING_Q);
  private static final RationalFunctionField<Q> RAT = new RationalFunctionField<>(Rationals.SINGLETON);
  private final ArrayList<Z> mS = new ArrayList<>();
  {
    mS.add(null);
  }
  private int mN = 0;

  private Z rr(final int n) {
    Polynomial<Polynomial<Q>> w = RING_X.one();
    Polynomial<Polynomial<Q>> p = RING_X.one();
    Polynomial<Polynomial<Q>> po = RING_X.one();

    // for(i=1, n, w=p-po*x*q^i; po=p; p=w);
    for (int i = 1; i <= n; ++i) {
      w = RING_X.subtract(p, RING_X.multiply(po, RING_X.monomial(RING_Q.monomial(Q.ONE, i), 1), n));
      po = p;
      p = w;
    }
    System.out.println("w=" + w);

    final int m = w.degree();
    Polynomial<Polynomial<Q>> w1 = RING_X.zero();
    for (int i = 0; i <= m; ++i) {
      final Polynomial<Q> h = w.coeff(i);
      Polynomial<Q> h1 = RING_Q.zero();
      for (int j = 1; j <= n - 1 + i; ++j) {
        h1 = RING_Q.add(h1, RING_Q.monomial(h.coeff(j), j));
      }
      w1 = RING_X.add(w1, RING_X.monomial(h1, i));
    }
    System.out.println("w1=" + w1);

    // for (i=1, n-1, q=q+s[i]/x^i)
    RationalFunction<Q> q = RAT.zero();
    for (int i = 1; i < n; ++i) {
      q = RAT.add(q, new RationalFunction<>(RING_Q.monomial(new Q(mS.get(i)), 0), RING_Q.monomial(Q.ONE, i)));
    }
    System.out.println("q=" + q);

    //final Polynomial<Q> qnum = q.left();

    // z=eval(w1) (i.e., substitute for q in w1
    RationalFunction<Q> z = RAT.zero();
    for (int k = 0; k <= w1.degree(); ++k) {
      final Polynomial<Q> w1k = w1.coeff(k);
      RationalFunction<Q> zk = RAT.zero();
      for (int j = 0; j <= w1k.degree(); ++j) {
        final Q c = w1k.coeff(j);
        if (!c.equals(Q.ZERO)) {
          //System.out.println("q=" + q + "^" + j + " * " + c);
          zk = RAT.add(zk, RAT.multiply(RAT.pow(q, j), c));
        }
      }

//      final Polynomial<Q> subsk = RING_Q.substitute(w1k, qnum, Integer.MAX_VALUE);
//      System.out.println(subsk + " cf. " + zk);

      //System.out.println("w1k= " + w1k + " -> zk=" + zk);
      z = RAT.add(z, RAT.multiply(zk, RING_Q.monomial(Q.ONE, k))); // i.e. * x^k
    }
    System.out.println("z=" + z);

    final Q coeff = z.left().coeff(z.right().degree() - mN + 1); //shift(-z.right().degree());
   // System.out.println("HHHH: " + coeff.coeff(0));

//    final Polynomial<Q> h2 = RING_X.coeff(RING_X.one(), w1, n - 1);
//    System.out.println("h2=" + h2);

    return coeff.toZ(); //.coeff(0).toZ();

  }

  @Override
  public Z next() {
    if (++mN == 1) {
      mS.add(Z.ONE);
    } else {
      mS.add(rr(mN));
    }
    return mS.get(mS.size() - 1);
  }
}

/*
{RR(n, w, z, p, po, i, m, h, h1, j, w1, h2)=w=1+O(x^(n+1)); p=1; po =1; for(i=1, n, w=p-po*x*q^i; po=p; p=w);
 m=poldegree(w);
  w1=0;
 for(i=0, m, h=polcoeff(w, i); h1=0; for (j=1, n-1+i, h1=h1+polcoeff(h, j)*q^j); w1=w1+h1*x^i);
 q=0;
 for (i=1, n-1, q=q+s[i]/x^i);
 q=q+y/x^n;
 z=eval(w1);
 kill(q);
 h2=polcoeff(z, -(n-1));
 polcoeff(h2, 1)*polcoeff(h2, 0)*(-1)
 }

 s=vector(30); s[1]=1; print(s[1]); for (j=2, 30, s[j]=RR(j); print(s[j]));
 */
