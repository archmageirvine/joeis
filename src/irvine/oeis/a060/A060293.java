package irvine.oeis.a060;

import irvine.math.q.HarmonicSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060293 Expected coupon collection numbers rounded up; i.e., if aiming to collect a set of n coupons, the expected number of random coupons required to receive the full set.
 * @author Sean A. Irvine
 */
public class A060293 extends Sequence0 {

  private final HarmonicSequence mH = new HarmonicSequence();
  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : mH.nextQ().multiply(mN).ceiling();
  }
}
