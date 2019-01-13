package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003600.
 * @author Sean A. Irvine
 */
public class A003600 implements Sequence {

  private long mN = -1;
  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Z.valueOf(mN).add(3).multiply(mN).add(8).multiply(mN).divide(6);
  }
}
