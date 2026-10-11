package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086839 Number of steps needed to reverse a pattern of length 2*n of cellular automaton Rule 90.
 * @author Sean A. Irvine
 */
public class A086839 extends Sequence1 {

  // After Frank Buss

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    if (mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    final long count = 1L << mN;
    final long count1 = count >>> 1;
    long max = -1;
    for (long i = 0; i < count; ++i) {
      // reverse value
      long reverse = 0;
      for (long j = i, b2 = count1; b2 > 0; b2 >>>= 1, j >>>= 1) {
        reverse <<= 1;
        reverse += j & 1;
      }
      // count steps for reversing
      long steps = 0;
      long current = i;
      while (current != reverse) {
        ++steps;
        current = (current >>> 1) ^ (current << 1) & (count - 1);
      }
      // check if more than the current maximum
      if (steps > max) {
        max = steps;
      }
    }
    return Z.valueOf(max);
  }
}
