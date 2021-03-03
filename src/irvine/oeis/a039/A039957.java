package irvine.oeis.a039;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039957.
 * @author Sean A. Irvine
 */
public class A039957 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 4;
      if (LongUtils.isSquareFree(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

