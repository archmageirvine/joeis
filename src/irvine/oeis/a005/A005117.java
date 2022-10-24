package irvine.oeis.a005;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005117 Squarefree numbers: numbers that are not divisible by a square greater than 1.
 * @author Sean A. Irvine
 */
public class A005117 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.isSquareFree(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

