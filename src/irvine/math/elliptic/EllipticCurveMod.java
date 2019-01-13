package irvine.math.elliptic;

import java.util.Iterator;

import irvine.math.group.AbstractGroup;
import irvine.math.z.Z;

/**
 * Elliptic curve over a prime field.
 * @author Sean A. Irvine
 */
public class EllipticCurveMod extends AbstractGroup<Z[]> {

  private static final Z[] ZERO = null;

  private final Z mA, mP;

  /**
   * Construct the elliptic curve <code>y^2=x^3+ax+b(mod p)</code>.
   * @param a coefficient
   * @param b coefficient
   * @param p modulus
   * @exception ArithmeticException if discriminant is 0.
   */
  public EllipticCurveMod(final Z a, final Z b, final Z p) {
    if (Z.ZERO.equals(Z.FOUR.multiply(a.square().multiply(a)).subtract(b.square().multiply(27)).mod(p))) {
      throw new ArithmeticException();
    }
    mP = p;
    mA = a;
  }

  @Override
  public Z[] zero() {
    return ZERO;
  }

  @Override
  public boolean isAbelian() {
    return true;
  }

  @Override
  public Z[] add(final Z[] p, final Z[] q) {
    if (p == null || q == null) {
      return null;
    }
    if (p[0].equals(q[0])) {
      if (p[1].equals(q[1])) {
        return doublePoint(p);
      }
      if (q[1].negate().mod(mP).equals(p[1])) {
        return null; // point at infinity
      }
    }
    final Z slope = p[1].subtract(q[1]).modMultiply(p[0].subtract(q[0]).mod(mP).modInverse(mP), mP);
    final Z x = slope.square().subtract(p[0]).subtract(q[0]).mod(mP);
    return new Z[] {
      x,
      p[1].negate().add(slope.multiply(p[0].subtract(x))).mod(mP)
    };
  }

  /**
   * Double the specified point.
   * @param p point to double
   * @return the doubled point
   */
  public Z[] doublePoint(final Z[] p) {
    if (p == null || Z.ZERO.equals(p[1])) {
      return p;
    }
    final Z slope = p[0].square().multiply(3).add(mA).modMultiply(p[1].multiply2().mod(mP).modInverse(mP), mP);
    final Z x = slope.square().subtract(p[0].multiply2()).mod(mP);
    return new Z[] {
      x,
      p[1].negate().add(slope.multiply(p[0].subtract(x))).mod(mP)
    };
  }

  /**
   * Multiply a point by an integer.
   * @param p point
   * @param n multiplier
   * @return multiplied point
   */
  public Z[] multiply(final Z[] p, final Z n) {
    if (p == null) {
      return null;
    }
    if (n.signum() <= 0) {
      throw new ArithmeticException();
    }
    Z[] m = p;
    for (int e = n.bitLength() - 2; e >= 0; --e) {
      m = doublePoint(m);
      if (n.testBit(e)) {
        m = add(m, p);
      }
    }
    return m;
  }

  @Override
  public Z[] negate(final Z[] a) {
    return multiply(a, Z.NEG_ONE);
  }

  @Override
  public Z size() {
    throw new UnsupportedOperationException(); // todo hard?
  }

  @Override
  public boolean contains(final Z[] element) {
    return element.length == 2; // todo
  }

  @Override
  public Iterator<Z[]> iterator() {
    throw new UnsupportedOperationException();
  }

}
