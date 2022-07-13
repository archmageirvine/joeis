package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a014.A014261;

/**
 * A108418 Primes with at least one of each odd digit and no even digits.
 * @author Georg Fischer
 */
public class A108418 implements SequenceWithOffset {

  private long mN = 13577;

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (A014261.isOddDigits(mN)) {
        final Z n = Z.valueOf(mN);
        final int[] counts = ZUtils.digitCounts(n);
        if (counts[1] > 0 && counts[3] > 0 && counts[5] > 0 && counts[7] > 0 && counts[9] > 0 && n.isPrime()) {
          return n;
        }
      }
    }
  }
}
