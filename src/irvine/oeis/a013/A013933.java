package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013933 Numbers k such that the sum of the first k nonsquarefree numbers is nonsquarefree.
 * @author Sean A. Irvine
 */
public class A013933 implements Sequence {

  private long mN = 0;
  private long mM = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      if (!LongUtils.isSquareFree(++mN)) {
        ++mM;
        mSum = mSum.add(mN);
        if (!Cheetah.factor(mSum).isSquareFree()) {
          return Z.valueOf(mM);
        }
      }
    }
  }

}

