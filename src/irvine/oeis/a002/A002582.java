package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002582.
 * @author Sean A. Irvine
 */
public class A002582 implements Sequence {

  /**
   * Find the largest prime factor of n.
   * @param n number to factor
   * @return largest prime factor of n
   */
  public static Z lpf(final Z n) {
    if (n.isProbablePrime()) {
      return n;
    } else if (Z.ONE.equals(n)) {
      return Z.ONE;
    } else {
      final Z[] factors = Jaguar.factor(n).toZArray();
      return factors[factors.length - 1];
    }
  }

  private Z mF = Z.ONE;
  private int mN = 1;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return lpf(mF.subtract(1));
  }
}
