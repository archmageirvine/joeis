package irvine.oeis.a039;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039956.
 * @author Sean A. Irvine
 */
public class A039956 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (LongUtils.isSquareFree(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

