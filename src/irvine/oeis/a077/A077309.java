package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077309 Concatenation of n numbers starting with n.
 * @author Sean A. Irvine
 */
public class A077309 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (long k = 0; k < mN; ++k) {
      sb.append(mN + k);
    }
    return new Z(sb);
  }
}
