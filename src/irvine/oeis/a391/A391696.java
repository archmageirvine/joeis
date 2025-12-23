package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391696 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A391696 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= 1L << mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mN - 2).shiftLeft(mN).add(3).add(Z.valueOf(mM).multiply(mN));
  }
}

