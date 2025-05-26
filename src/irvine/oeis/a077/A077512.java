package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077512 Largest n-digit square beginning with n.
 * @author Sean A. Irvine
 */
public class A077512 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    sb.append(mN);
    while (sb.length() < mN) {
      sb.append(9);
    }
    return new Z(sb).sqrt().square();
  }
}
