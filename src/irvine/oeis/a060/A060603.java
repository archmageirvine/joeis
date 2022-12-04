package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060601.
 * @author Sean A. Irvine
 */
public class A060603 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN + 1).multiply((long) mN * mN - 1).divide(24);
  }
}
