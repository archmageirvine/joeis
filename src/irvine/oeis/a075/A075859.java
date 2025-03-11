package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075859 a(n) = n concatenated with n 1's and n.
 * @author Sean A. Irvine
 */
public class A075859 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return new Z(++mN + "1".repeat(mN) + mN);
  }
}
