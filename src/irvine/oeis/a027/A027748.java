package irvine.oeis.a027;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027748 Irregular triangle in which first row is 1, n-th row (n &gt; 1) lists distinct prime factors of n.
 * @author Sean A. Irvine
 */
public class A027748 implements Sequence {

  private long mN = 0;
  private Z[] mList = new Z[0];
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mList.length) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mList = Cheetah.factor(mN).toZArray();
      mM = 0;
    }
    return mList[mM];
  }
}
