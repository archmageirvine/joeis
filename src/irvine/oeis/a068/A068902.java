package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068902 Least multiple of n not less than the n-th prime.
 * @author Sean A. Irvine
 */
public class A068902 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().add(mN++).divide(mN).multiply(mN);
  }
}
