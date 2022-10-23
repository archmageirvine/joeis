package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A033933 Least nonnegative m such that n! - m is prime.
 * @author Sean A. Irvine
 */
public class A033933 extends Sequence2 {

  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    Z m = mF;
    while (true) {
      if (m.isProbablePrime()) {
        return mF.subtract(m);
      }
      m = m.subtract(1);
    }
  }
}

