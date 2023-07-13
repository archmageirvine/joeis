package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004279 1, 3, 5 and the positive even numbers.
 * @author Sean A. Irvine
 */
public class A004279 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += mN < 6 ? 1 : 2;
    return Z.valueOf(mN);
  }
}
