package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004276 0, 2, 4 and the odd numbers.
 * @author Sean A. Irvine
 */
public class A004276 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += mN < 5 ? 1 : 2;
    return Z.valueOf(mN);
  }
}
