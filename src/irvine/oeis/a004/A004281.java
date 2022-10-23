package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004281 2, 4 and the odd numbers.
 * @author Sean A. Irvine
 */
public class A004281 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += mN < 5 ? 1 : 2;
    return Z.valueOf(mN);
  }
}
