package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013931 a(n) is squarefree and sum of all squarefrees &lt;= a(n) is squarefree.
 * @author Sean A. Irvine
 */
public class A013931 implements Sequence {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.isSquareFree(++mN)) {
        mSum = mSum.add(mN);
        if (Cheetah.factor(mSum).isSquareFree()) {
          return Z.valueOf(mN);
        }
      }
    }
  }

}

