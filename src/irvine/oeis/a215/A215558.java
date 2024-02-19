package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A215558.
 * @author Sean A. Irvine
 */
public class A215558 extends Sequence1 {

  private long mN = -1;
  private long mMod = 10;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mMod) {
        mMod *= 10;
      }
      final Z n3 = Z.valueOf(mN).pow(3);
      if (n3.mod(mMod) == mN) {
        return n3;
      }
    }
  }
}
