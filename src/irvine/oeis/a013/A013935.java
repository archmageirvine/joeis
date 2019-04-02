package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013935 a(n) is nonsquarefree and is sum of first k nonsquarefrees for some k.
 * @author Sean A. Irvine
 */
public class A013935 implements Sequence {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      if (!LongUtils.isSquareFree(++mN)) {
        mSum = mSum.add(mN);
        if (!Cheetah.factor(mSum).isSquareFree()) {
          return mSum;
        }
      }
    }
  }

}

