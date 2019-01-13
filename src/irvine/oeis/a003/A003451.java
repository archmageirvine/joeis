package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003451.
 * @author Sean A. Irvine
 */
public class A003451 implements Sequence {

  private long mN = 4;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      return Z.valueOf(mN).multiply(mN - 2).multiply(mN - 4).divide(12);
    } else {
      return Z.valueOf(mN + 1).multiply(mN - 3).multiply(mN - 4).divide(12);
    }
  }
}
