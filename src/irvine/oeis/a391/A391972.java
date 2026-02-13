package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391972 allocated for Andrey Mateshko.
 * @author Sean A. Irvine
 */
public class A391972 extends Sequence1 {

  private long mOnes = 1;
  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mA.isProbablePrime()) {
      ++mOnes;
      mA = Z.ONE;
    } else {
      mA = mA.add(mN - mOnes);
    }
    return mA;
  }
}
