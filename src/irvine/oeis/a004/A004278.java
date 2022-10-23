package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004278 1, 3 and the positive even numbers.
 * @author Sean A. Irvine
 */
public class A004278 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += mN < 4 ? 1 : 2;
    return Z.valueOf(mN);
  }
}
