package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079804.
 * @author Sean A. Irvine
 */
public class A079809 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (long k = 1; k <= (mN + 1) / 2; ++k) {
      sb.append(((mN + 1 - k) & 1) == 1 ? mN + 2 - 2 * k : k);
    }
    return new Z(sb);
  }
}

