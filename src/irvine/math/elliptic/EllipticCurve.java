package irvine.math.elliptic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.group.AbstractGroup;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.util.Pair;

/**
 * An elliptic curve.
 *
 * @author Sean A. Irvine
 */
public class EllipticCurve extends AbstractGroup<EllipticCurvePoint> {

  // Notation here follows Cremona.
  private static final Z Z1728 = Z.valueOf(1728);

  private final Q mA1;
  private final Q mA2;
  private final Q mA3;
  private final Q mA4;
  private final Q mA6;
  private Q mB2 = null;
  private Q mB4 = null;
  private Q mB6 = null;
  private Q mB8 = null;
  private Q mC4 = null;
  private Q mC6 = null;
  private Q mDelta = null;
  private Q mJ = null;

  /**
   * Construct the curve <code>E: y^2+a_1xy+a_3y=x^3+a_2x^2+a_4x+a_6</code>
   * with rational coefficients.  That is, create the curve in Weierstrass
   * form.  Strictly speaking the discriminant as returned by the
   * <code>discriminant()</code> method, must be non-zero for this to be an
   * elliptic curve.  However, we still allow the creation of such singular
   * curves anyway.
   * @param a1 <code>xy</code> coefficient
   * @param a2 <code>x^2</code> coefficient
   * @param a3 <code>y</code> coefficient
   * @param a4 <code>x</code> coefficient
   * @param a6 constant coefficient
   */
  public EllipticCurve(final Q a1, final Q a2, final Q a3, final Q a4, final Q a6) {
    mA1 = a1;
    mA2 = a2;
    mA3 = a3;
    mA4 = a4;
    mA6 = a6;
  }

  private static int ord(final long a, Z b) {
    int d = 0;
    while (b.mod(a) == 0) {
      ++d;
      b = b.divide(a);
    }
    return d;
  }

  /**
   * Construct a minimal elliptic curve from integer invariants for the curve.
   * Uses the Laska-Kraus-Connell algorithm.
   * @param c4 invariant
   * @param c6 invariant
   * @throws ArithmeticException if <code>(c4^3-c6^2)/1728</code> is not an integer,
   * or the discriminant is 0.
   * @throws UnsupportedOperationException if the factorization problem needed to
   * compute this curve is too hard.
   */
  public EllipticCurve(final Z c4, final Z c6) {
    final Z c6s = c6.square();
    final Q deltaQ = new Q(c4.pow(3).subtract(c6s), Z1728);
    if (Q.ZERO.equals(deltaQ) || !deltaQ.isInteger()) {
      throw new ArithmeticException();
    }
    final Z delta = deltaQ.toZ();
    final Z g = c6s.gcd(delta);
    final FactorSequence pf = new PrimeDivision().factorize(g);
    if (!pf.isComplete()) {
      throw new UnsupportedOperationException();
    }
    Z u = Z.ONE;
    for (final Z p : pf.toZArray()) {
      int d = pf.getExponent(p) / 12;
      if (Z.TWO.equals(p)) {
        final long a = c4.shiftRight(4 * d).mod(16);
        final long b = c6.shiftRight(6 * d).mod(32);
        if (((b & 3) != 3) && !(a == 0 && (b == 0 || b == 8))) {
          --d;
        }
      } else if (Z.THREE.equals(p) && ord(3, c6) == 6 * d + 2) {
        --d;
      }
      u = u.multiply(p.pow(d));
    }
    final Z u2 = u.square();
    final Z u4 = u2.square();
    final Z c4z = c4.divide(u4);
    mC4 = new Q(c4z);
    final Z c6z = c6.divide(u4.multiply(u2));
    mC6 = new Q(c6z);
    mB2 = new Q(c6z.mod(12)).negate();
    mB4 = mB2.square().subtract(c4z).divide(24);
    mB6 = mB2.multiply(mB4).multiply(36).subtract(mB2.pow(3)).subtract(c6z).divide(216);
    mA1 = mB2.toZ().isEven() ? Q.ZERO : Q.ONE;
    mA3 = mB6.toZ().isEven() ? Q.ZERO : Q.ONE;
    mA2 = mB2.subtract(mA1).divide(4);
    mA4 = mB4.subtract(mA1.multiply(mA3)).divide(2);
    mA6 = mB6.subtract(mA3).divide(4);
  }


  /**
   * Test if the curve is integral.
   * @return true iff the curve is defined over the integers
   */
  public boolean isIntegral() {
    return mA1.isInteger() && mA2.isInteger() && mA3.isInteger() && mA4.isInteger() && mA6.isInteger();
  }

  /** @return a1 coefficient */
  public Q a1() {
    return mA1;
  }

  /** @return a1 coefficient */
  public Q a2() {
    return mA2;
  }

  /** @return a1 coefficient */
  public Q a3() {
    return mA3;
  }

  /** @return a1 coefficient */
  public Q a4() {
    return mA4;
  }

  /** @return a1 coefficient */
  public Q a6() {
    return mA6;
  }

  /**
   * An auxiliary quantity.
   * @return <code>a_1^2+4a_2</code>
   */
  public Q b2() {
    if (mB2 == null) {
      mB2 = a1().square().add(a2().multiply(4));
    }
    return mB2;
  }

  /**
   * An auxiliary quantity.
   * @return <code>a_1a_3+2a_4</code>
   */
  public Q b4() {
    if (mB4 == null) {
      mB4 = a1().multiply(a3()).add(a4().multiply(2));
    }
    return mB4;
  }

  /**
   * An auxiliary quantity.
   * @return <code>a_3^2+4a_6</code>
   */
  public Q b6() {
    if (mB6 == null) {
      mB6 = a3().square().add(a6().multiply(4));
    }
    return mB6;
  }

  /**
   * An auxiliary quantity.
   * @return <code>a_1^2a_6-a_1a_3a_4+4a_2a_6+a_2a_3^2-a_4^2</code>
   */
  public Q b8() {
    if (mB8 == null) {
      mB8 = a1().square().multiply(a6())
        .subtract(a1().multiply(a3()).multiply(a4()))
        .add(a2().multiply(a6()).multiply(4))
        .add(a3().square().multiply(a2()))
        .subtract(a4().square());
    }
    return mB8;
  }

  /**
   * An invariant.
   * @return <code>b_2^2-24b_4</code>
   */
  public Q c4() {
    if (mC4 == null) {
      mC4 = b2().square().subtract(b4().multiply(24));
    }
    return mC4;
  }

  /**
   * An invariant.
   * @return <code>-b_2^3+36b_2b_4-216b_6</code>
   */
  public Q c6() {
    if (mC6 == null) {
      mC6 = b2().multiply(b4()).multiply(36)
        .subtract(b2().pow(3))
        .subtract(b6().multiply(216));
    }
    return mC6;
  }

  /**
   * The discriminant, Delta.
   * @return <code>-b_2^2b_8-8b_4^3-27b_6^2+9b_2b_4b_6</code>
   */
  public Q discriminant() {
    if (mDelta == null) {
      mDelta = b2().multiply(b4()).multiply(b6()).multiply(9)
        .subtract(b2().square().multiply(b8()))
        .subtract(b4().pow(3).multiply(8))
        .subtract(b6().square().multiply(27));
    }
    return mDelta;
  }

  /**
   * The j-invariant.  This quantity is invariant under isomorphism.
   * Elliptic curves with the same j are called twists; they are
   * isomorphic over an algebraic extension, but not necessarily over
   * Q.
   * @return <code>c_4^3/Delta</code>
   */
  public Q j() {
    if (mJ == null) {
      mJ = c4().pow(3).divide(discriminant());
    }
    return mJ;
  }

  /**
   * Produce an isomorphic curve using the supplied transformation.
   * <code>x=u^2x'+r</code> and <code>y=u^3y'+su^2x'+t</code>. The
   * transformed curve is guaranteed to have the same j-invariant as
   * this curve.
   * @param r parameter
   * @param s parameter
   * @param t parameter
   * @param u non-zero parameter
   * @return isomorphic curve corresponding to twist
   * @throws ArithmeticException if <code>u</code> is 0.
   */
  public EllipticCurve twist(final Q r, final Q s, final Q t, final Q u) {
    if (Q.ZERO.equals(u)) {
      throw new ArithmeticException();
    }
    final Q a1 = a1().add(s.multiply(2)).divide(u);
    final Q u2 = u.square();
    final Q a2 = a2().subtract(s.multiply(a1())).add(r.multiply(3)).subtract(s.square()).divide(u2);
    final Q u3 = u2.multiply(u);
    final Q a3 = a3().add(r.multiply(a1())).add(t.multiply(2)).divide(u3);
    final Q u4 = u3.multiply(u);
    final Q a4 = a4().subtract(s.multiply(a3()))
      .add(r.multiply(2).multiply(a2()))
      .subtract(t.add(r.multiply(s)).multiply(a1()))
      .add(r.square().multiply(3))
      .subtract(s.multiply(t).multiply(2))
      .divide(u4);
    final Q u6 = u4.multiply(u2);
    final Q r2 = r.square();
    final Q a6 = a6().add(r.multiply(a4())).add(r2.multiply(a2()))
      .add(r2.multiply(r)).subtract(t.multiply(a3()))
      .subtract(t.square()).subtract(r.multiply(t).multiply(a1()))
      .divide(u6);
    return new EllipticCurve(a1, a2, a3, a4, a6);
  }

  private final HashMap<Z, String> mKodaira = new HashMap<>();
  private final HashMap<Z, Long> mExponentInConductor = new HashMap<>();
  private final HashMap<Z, Long> mLocalIndex = new HashMap<>();

  private Z root(final Z aa, final int e, final Z p) {
    final Z a = ZUtils.bestRemainder(aa, p);
    Z i = Z.ZERO;
    while (true) {
      i = i.add(1);
      final Z t;
      if (e == 2) {
        t = i.square().subtract(a);
      } else {
        t = i.pow(3).subtract(a);
      }
      if (t.mod(p).isZero()) {
        return i;
      }
    }
  }

  // Test for types In, II, III, IV
  private void tate1(final Z p, final long n, final EllipticCurve original) {
    if (!c4().toZ().mod(p).isZero()) {
      final long cp;
      if (PolynomialUtils.quadraticRootsExist(Z.ONE, a1().toZ(), a2().toZ().negate(), p)) {
        cp = n;
      } else if ((n & 1) == 0) {
        cp = 2;
      } else {
        cp = 1;
      }
      original.mKodaira.put(p, "I" + n);
      original.mExponentInConductor.put(p, 1L);
      original.mLocalIndex.put(p, cp);
      return;
    }
    final Z p2 = p.square();
    final Z a6z = a6().toZ();
    if (!a6z.mod(p2).isZero()) {
      original.mKodaira.put(p, "II");
      original.mExponentInConductor.put(p, n);
      original.mLocalIndex.put(p, 1L);
      return;
    }
    final Z p3 = p2.multiply(p);
    final Z b8z = b8().toZ();
    if (!b8z.mod(p3).isZero()) {
      original.mKodaira.put(p, "III");
      original.mExponentInConductor.put(p, n - 1);
      original.mLocalIndex.put(p, 2L);
      return;
    }
    if (!b6().toZ().mod(p3).isZero()) {
      final long cp = PolynomialUtils.quadraticRootsExist(Z.ONE, a3().toZ().divide(p), a6().toZ().divide(p2).negate(), p) ? 3 : 1;
      original.mKodaira.put(p, "IV");
      original.mExponentInConductor.put(p, n - 2);
      original.mLocalIndex.put(p, cp);
      return;
    }
    // Change coordinates so that p | a1,a2; p^2 | a3,a4; p^3 | a6
    final Z s;
    final Z u;
    if (Z.TWO.equals(p)) {
      s = root(a2().toZ(), 2, p);
      u = root(a6().toZ().divide(4), 2, p).multiply(p);
    } else if (Z.THREE.equals(p)) {
      s = a1().toZ();
      u = a3().toZ();
    } else {
      final Z i2 = Z.TWO.modInverse(p);
      s = i2.multiply(a1().toZ()).negate();
      u = i2.multiply(a3().toZ()).negate();
    }
    twist(Q.ZERO, new Q(s), new Q(u), Q.ONE).tate2(p, n, original);
  }

  private void tate2(final Z p, final long n, final EllipticCurve original) {
    // Set up auxiliary cubic T^3+bT^2+cT+d
    final Z b = a2().toZ().divide(p);
    final Z p2 = p.square();
    final Z c = a4().toZ().divide(p2);
    final Z p3 = p2.multiply(p);
    final Z d = a6().toZ().divide(p3);
    final Z b2 = b.square();
    final Z w = d.square().multiply(27).subtract(b2.multiply(c.square())).add(b.pow(3).multiply(d).multiply(4)).subtract(b.multiply(c).multiply(d).multiply(18)).add(c.pow(3).multiply(4));
    final Z x = c.multiply(3).subtract(b2);
    // Test for distinct root: type I*0
    if (!w.mod(p).isZero()) {
      original.mKodaira.put(p, "I*0");
      original.mExponentInConductor.put(p, n - 4);
      original.mLocalIndex.put(p, 1L + PolynomialUtils.numberRootsCubic(b, c, d, p));
    } else if (!x.mod(p).isZero()) {
      // Double root: type I*m, change coordinates so that the double root is T == 0
      final Z r;
      if (Z.TWO.equals(p)) {
        r = c;
      } else if (Z.THREE.equals(p)) {
        r = b.multiply(c);
      } else {
        r = b.multiply(c).subtract(d.multiply(9)).multiply(x.multiply2().modInverse(p));
      }
      twist(new Q(p.multiply(r.mod(p))), Q.ZERO, Q.ZERO, Q.ONE).tate3(p, n, original);
    } else {
      // Triple root case: types II*, III*, IV* or non-minimal
      // Change coordinates so that the triple root is T == 0
      final Z r1;
      if (Z.TWO.equals(p)) {
        r1 = b;
      } else if (Z.THREE.equals(p)) {
        r1 = root(d.negate(), 3, p);
      } else {
        final Z rp = Z.THREE.modInverse(p);
        r1 = b.negate().multiply(rp.signum() < 0 ? rp.add(p) : rp);
      }
      final Z r = ZUtils.bestRemainder(r1, p).multiply(p);
      twist(new Q(r), Q.ZERO, Q.ZERO, Q.ONE).tate4(p, p2, n, original);
    }
  }

  private void tate3(final Z p, final long n, final EllipticCurve original) {
    // Make a3, a4, a6 repeatedly more divisible by p
    long m = 1;
    Z mx = p.square();
    Z my = mx;
    long cp = 0;
    EllipticCurve ec = this;
    while (cp == 0) {
      final Z xa3 = ec.a3().toZ().divide(my);
      Z xa6 = ec.a6().toZ().divide(mx.multiply(my));
      if (!xa3.square().add(xa6.multiply(4)).mod(p).isZero()) {
        cp = PolynomialUtils.quadraticRootsExist(Z.ONE, xa3, xa6.negate(), p) ? 4 : 2;
      } else {
        final Z t = my.multiply(Z.TWO.equals(p) ? xa6 : xa3.multiply(Z.TWO.modInverse(p)).mod(p).negate());
        ec = ec.twist(Q.ZERO, Q.ZERO, new Q(t), Q.ONE);
        my = my.multiply(p);
        ++m;
        final Z xa2 = ec.a2().toZ().divide(p);
        //xa3 = ec.a3().toZ().divide(my);
        final Z xa4 = ec.a4().toZ().divide(mx.multiply(p));
        xa6 = ec.a6().toZ().divide(mx.multiply(my));
        if (!xa4.square().subtract(xa2.multiply(xa6).multiply(4)).mod(p).isZero()) {
          cp = PolynomialUtils.quadraticRootsExist(xa2, xa4, xa6, p) ? 4 : 2;
        } else {
          final Z r;
          if (Z.TWO.equals(p)) {
            r = mx.multiply(xa6.multiply(xa2).mod(Z.TWO));
          } else {
            r = mx.multiply(xa4.multiply(xa2.multiply2().modInverse(p)).mod(p).negate());
          }
          ec = ec.twist(new Q(r), Q.ZERO, Q.ZERO, Q.ONE);
          mx = mx.multiply(p);
          ++m;
        }
      }
    }
    original.mKodaira.put(p, "I*" + m);
    original.mExponentInConductor.put(p, n - m - 4);
    original.mLocalIndex.put(p, cp);
  }

  private void tate4(final Z p, final Z p2, final long n, final EllipticCurve original) {
    final Z x3 = a3().toZ().divide(p2);
    final Z p4 = p2.square();
    final Z x6 = a6().toZ().divide(p4);
    final Z temp = x3.square().add(x6.multiply(4));
    // Test for type IV*
    if (!temp.mod(p).isZero()) {
      final long cp = PolynomialUtils.quadraticRootsExist(Z.ONE, x3, x6.negate(), p) ? 3 : 1;
      original.mKodaira.put(p, "IV*");
      original.mExponentInConductor.put(p, n - 6);
      original.mLocalIndex.put(p, cp);
    } else {
      // Change coordinates so that p^3 | a3, p^5 | a6
      final Z t;
      if (Z.TWO.equals(p)) {
        t = root(x6, 2, p).multiply(p2).negate();
      } else {
        t = ZUtils.bestRemainder(Z.TWO.modInverse(p).multiply(a3().toZ()).negate(), p).multiply(p2);
      }
      final EllipticCurve ec = twist(Q.ZERO, Q.ZERO, new Q(t), Q.ONE);
      if (!ec.a4().toZ().mod(p4).isZero()) {
        original.mKodaira.put(p, "III*");
        original.mExponentInConductor.put(p, n - 7);
        original.mLocalIndex.put(p, 2L);
      } else if (!ec.a6().toZ().mod(p4.multiply(p2)).isZero()) {
        original.mKodaira.put(p, "II*");
        original.mExponentInConductor.put(p, n - 8);
        original.mLocalIndex.put(p, 1L);
      } else {
        // Equation non-minimal: divide each a_i by p^i and start again
        twist(Q.ZERO, Q.ZERO, Q.ZERO, new Q(p)).tate(p, original);
      }
    }
  }

  private void tate(final Z p, final EllipticCurve original) {
    if (original.mKodaira.get(p) != null) {
      return; // Already computed
    }
    if (!isIntegral()) {
      throw new UnsupportedOperationException();
    }
    final int n = ZUtils.valuation(p, discriminant().toZ());
    if (n == 0) {
      original.mKodaira.put(p, "I0");
      original.mExponentInConductor.put(p, 0L);
      original.mLocalIndex.put(p, 1L);
      return;
    }
    // Change coordinates so that p | a3,a4,a6
    final Z r;
    final Z t;
    final Z b2z = b2().toZ();
    if (Z.TWO.equals(p)) {
      final Z a4z = a4().toZ();
      if (b2z.isEven()) {
        r = root(a4z, 2, p);
        t = root(r.add(a2().toZ()).multiply(r).add(a4z).multiply(r).add(a6().toZ()), 2, p);
      } else {
        r = a3().toZ().mod(p);
        t = r.add(a4z).mod(p);
      }
    } else if (Z.THREE.equals(p)) {
      if (b2z.mod(p).isZero()) {
        r = root(b6().toZ().negate(), 3, p);
      } else {
        r = b2z.modMultiply(b4().toZ(), p).negate();
      }
      t = a1().toZ().multiply(r).add(a3().toZ()).mod(p);
    } else {
      final Z c4z = c4().toZ();
      final Z r1;
      if (c4z.mod(p).isZero()) {
        r1 = Z.valueOf(12).modInverse(p).multiply(b2z).negate();
      } else {
        r1 = c4z.multiply(12).mod(p).modInverse(p).multiply(c6().toZ().add(b2z.multiply(c4z))).negate();
      }
      t = Z.TWO.modInverse(p).negate().multiply(a1().toZ().multiply(r1).add(a3().toZ())).mod(p);
      r = r1.mod(p);
    }
    // Test for types In, II, III, IV
    twist(new Q(r), Q.ZERO, new Q(t), Q.ONE).tate1(p, n, original);
  }

  /**
   * Return the Kodaira symbol for this curve at a prime.
   * @param p prime
   * @return Kodaira symbol
   */
  public String kodairaSymbol(final Z p) {
    tate(p, this);
    return mKodaira.get(p);
  }

  /**
   * The local index for this curve at a prime.
   * @param p prime
   * @return local index
   */
  public long localIndex(final Z p) {
    tate(p, this);
    return mLocalIndex.get(p);
  }

  /**
   * The exponent in the conductor for this prime.
   * @param p prime
   * @return exponent
   */
  public long exponentInConductor(final Z p) {
    tate(p, this);
    return mExponentInConductor.get(p);
  }

  @Override
  public EllipticCurvePoint zero() {
    return EllipticCurvePoint.ZERO;
  }

  @Override
  public Z size() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isAbelian() {
    return true;
  }

  @Override
  public EllipticCurvePoint add(final EllipticCurvePoint p, final EllipticCurvePoint q) {
    final Q x1 = p.x();
    final Q y1 = p.y();
    final Q y2 = q.y();
    final Q x2 = q.x();
    if (x1.equals(x2)) {
      if (!y1.equals(y2) || y1.multiply(2).add(x1.multiply(a1())).add(a3()).equals(Q.ZERO)) {
        return EllipticCurvePoint.ZERO;
      }
    }
    final Q m;
    final Q b;
    if (p.equals(q)) {
      m = x1.square().multiply(3).add(x1.multiply(a2()).multiply(2)).add(a4()).subtract(y1.multiply(a3()))
          .divide(y1.multiply(2).add(x1.multiply(a1())).add(a3()));
      b = a4().multiply(x1).subtract(x1.pow(3)).add(a6().multiply(2)).subtract(a3().multiply(y1))
          .divide(y1.multiply(2).add(a1().multiply(x1)).add(a3()));
    } else {
      m = y2.subtract(y1).divide(x2.subtract(x1));
      b = y1.multiply(x2).subtract(y2.multiply(x1)).divide(x2.subtract(x1));
    }
    final Q x3 = m.square().add(m.multiply(a1())).subtract(a2()).subtract(x1).subtract(x2);
    final Q y3 = x3.multiply(m.add(a1())).negate().subtract(b).subtract(a3());
    return new EllipticCurvePoint(x3, y3);
  }

  @Override
  public EllipticCurvePoint negate(final EllipticCurvePoint p) {
    return add(EllipticCurvePoint.ZERO, p);
  }

  @Override
  public Iterator<EllipticCurvePoint> iterator() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean contains(final EllipticCurvePoint p) {
    final Q x = p.x();
    final Q y = p.y();
    return y.square().add(x.multiply(y).multiply(a1())).add(y.multiply(a3()))
        .equals(x.pow(3).add(x.square().multiply(a2())).add(x.multiply(a4())).add(a6()));
  }

  /**
   * Compute the order of a point.
   * @param p point
   * @return order of the point
   */
  @Override
  public Z order(final EllipticCurvePoint p) {
    Z n = Z.ONE;
    EllipticCurvePoint q = p;
    while (q.x().isInteger() && !q.isZero()) {
      n = n.add(1);
      q = add(q, p);
    }
    return q.isZero() ? n : Z.ZERO;
  }

  /**
   * A list of torsion points and their orders.
   * @return torsion points
   */
  public List<Pair<EllipticCurvePoint, Z>> torsionPoints() {
    if (!Q.ZERO.equals(a1()) || !Q.ZERO.equals(a3()) || !isIntegral()) {
      throw new UnsupportedOperationException();
    }
    final Z delta = discriminant().toZ();
    final FactorSequence fs = Cheetah.factor(delta);
    final FactorSequence squarePart = new FactorSequence();
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (e > 1) {
        squarePart.add(p, FactorSequence.PRIME, (e >> 1) << 1);
      }
    }
    final ArrayList<Z> yList = new ArrayList<>();
    yList.add(Z.ZERO);
    Collections.addAll(yList, squarePart.divisors());
    final Z a = a2().toZ();
    final Z b = a4().toZ();
    final Z c = a6().toZ();
    final List<Pair<EllipticCurvePoint, Z>> res = new ArrayList<>();
    for (final Z y : yList) {
      for (final Z x : PolynomialUtils.zRootsCubic(a, b, c.subtract(y.square()))) {
        final EllipticCurvePoint p = new EllipticCurvePoint(new Q(x), new Q(y));
        final Z n = order(p);
        if (n.signum() > 0) {
          res.add(new Pair<>(p, n));
        }
      }
    }
    return res;
  }
}
