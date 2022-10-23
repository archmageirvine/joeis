package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060068.
 * @author Sean A. Irvine
 */
public class A060073 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN - 1).subtract(1).divide(mN - 1).divide(mN - 1);
  }
}
