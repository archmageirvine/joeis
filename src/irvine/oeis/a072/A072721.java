package irvine.oeis.a072;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072721 Number of partitions of n into parts which are each positive powers of a single number &gt;1 (which may vary between partitions).
 * @author Sean A. Irvine
 */
public class A072721 extends Sequence0 {

  private int mN = -1;
  private final HashSet<String> mPartitions = new HashSet<>();

  private void search(final int remaining, final int current, final int base, final String p) {
    if (remaining == 0) {
      mPartitions.add(p);
    } else if (current <= remaining) {
      search(remaining, current * base, base, p);
      search(remaining - current, current, base, p + "," + current);
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mPartitions.clear();
    for (int k = 2; k <= mN; ++k) {
      search(mN, k, k, "");
    }
    return Z.valueOf(mPartitions.size());
  }
}
