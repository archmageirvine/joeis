package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013932 Integers that are squarefree and also the sum of first k squarefrees for some k.
 * @author Sean A. Irvine
 */
public class A013932 implements Sequence {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.isSquareFree(++mN)) {
        mSum = mSum.add(mN);
        if (Jaguar.factor(mSum).isSquareFree()) {
          return mSum;
        }
      }
    }
  }

}

