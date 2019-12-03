package irvine.oeis.a027;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027749.
 * @author Sean A. Irvine
 */
public class A027749 implements Sequence {

  private long mN = 0;
  private Z[] mList = new Z[0];
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mList.length) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mList = Cheetah.factor(mN).divisorsSorted();
      mM = 1; // skip d == 1
    }
    return mList[mM];
  }
}
