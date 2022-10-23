package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000959;

/**
 * A057610 Smallest lucky number with a decimal expansion starting n, n-1, ..., 2, 1.
 * @author Sean A. Irvine
 */
public class A057610 extends Sequence0 {

  private int mN = 0;

  private String prefix(final int n) {
    final StringBuilder sb = new StringBuilder();
    for (int k = n; k > 0; --k) {
      sb.append(k);
    }
    return sb.toString();
  }

  @Override
  public Z next() {
    final String prefix = prefix(++mN);
    final Sequence mSeq = new A000959();
    while (true) {
      final Z lucky = mSeq.next();
      if (lucky.toString().startsWith(prefix)) {
        return lucky;
      }
    }
  }
}
