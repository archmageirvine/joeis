package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013934 Nonsquarefree numbers k such that the sum of all nonsquarefree numbers &lt;= k is nonsquarefree.
 * @author Sean A. Irvine
 */
public class A013934 implements Sequence {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      if (!LongUtils.isSquareFree(++mN)) {
        mSum = mSum.add(mN);
        if (!Jaguar.factor(mSum).isSquareFree()) {
          return Z.valueOf(mN);
        }
      }
    }
  }

}

