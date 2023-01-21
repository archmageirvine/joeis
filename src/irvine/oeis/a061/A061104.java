package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061104 Smallest number whose digit sum is n^2.
 * @author Sean A. Irvine
 */
public class A061104 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long s = ++mN * mN;
    return Z.TEN.pow(s / 9).multiply(s % 9 + 1).subtract(1);
  }
}
