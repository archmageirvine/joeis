package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013935 a(n) is nonsquarefree and is sum of first k nonsquarefrees for some k.
 * @author Sean A. Irvine
 */
public class A013935 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      if (!LongUtils.isSquareFree(++mN)) {
        mSum = mSum.add(mN);
        if (!Jaguar.factor(mSum).isSquareFree()) {
          return mSum;
        }
      }
    }
  }

}

