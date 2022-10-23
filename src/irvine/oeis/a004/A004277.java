package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004277 1 together with positive even numbers.
 * @author Sean A. Irvine
 */
public class A004277 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += mN < 2 ? 1 : 2;
    return Z.valueOf(mN);
  }
}
