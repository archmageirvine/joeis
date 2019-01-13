package irvine.oeis.a005;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005117.
 * @author Sean A. Irvine
 */
public class A005117 implements Sequence {

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

