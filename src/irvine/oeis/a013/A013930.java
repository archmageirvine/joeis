package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013930 Sum of first a(n) squarefrees is squarefree.
 * @author Sean A. Irvine
 */
public class A013930 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.isSquareFree(++mN)) {
        ++mM;
        mSum = mSum.add(mN);
        if (Jaguar.factor(mSum).isSquareFree()) {
          return Z.valueOf(mM);
        }
      }
    }
  }

}

