package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394612 Records corresponding to A394361.
 * @author Sean A. Irvine
 */
public class A394612 extends Sequence1 {

  private Z mRecord = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s0 = Functions.SIGMA0.z(Z.valueOf(++mN).square().add(1));
      if (s0.compareTo(mRecord) > 0) {
        mRecord = s0;
        return mRecord;
      }
    }
  }
}
