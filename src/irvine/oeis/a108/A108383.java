package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a014.A014261;

/**
 * A108383 Primes p such that p&apos;s set of distinct digits is {1, 3, 9}.
 * @author Georg Fischer
 */
public class A108383 implements SequenceWithOffset {

  private long mN = 137;

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
        if (counts[1] > 0 && counts[3] > 0 && counts[5] == 0 && counts[7] == 0 && counts[9] > 0 && n.isPrime()) {
          return n;
        }
      }
    }
  }
}
