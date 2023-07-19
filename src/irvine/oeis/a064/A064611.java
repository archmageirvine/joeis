package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064611 Partial sum of usigma is divisible by n, where usigma(n) = A034448(n) and summatory-usigma(n) = A064609(n).
 * @author Sean A. Irvine
 */
public class A064611 extends A064609 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
