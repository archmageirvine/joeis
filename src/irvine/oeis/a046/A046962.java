package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046962 Bessel function |J_0(n)| is a monotonically decreasing positive sequence.
 * @author Sean A. Irvine
 */
public class A046962 implements Sequence {

  private CR mBest = CR.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR j0 = CR.valueOf(++mN).besselJ0().abs();
      if (j0.compareTo(mBest) < 0) {
        mBest = j0;
        return Z.valueOf(mN);
      }
    }
  }
}
