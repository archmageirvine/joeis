package irvine.oeis.a006;

import java.util.HashSet;
import java.util.Set;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionSequence;

/**
 * A006021 The game of contours.
 * @author Sean A. Irvine
 */
public class A006021 extends MemoryFunctionSequence<Long, Long> {

  // Uses non-negative indices for n and negative indices for tilde n
  // This sequence is actually periodic so a simpler implementation is possible

  private void augment(final Set<Long> seen, final long n) {
    for (long a = 1; a < n; a++) {
      // n -> a + tilde b where a + b == n - 1
      final Long key = -a;
      seen.add(get(key) ^ get(n - a - 1));
    }
  }

  private void augmentTilde(final Set<Long> seen, final long n) {
    for (long a = 0; a < n; a++) {
      // tilde n -> tilde a + tilde b where a + b == n - 1
      seen.add(get(a) ^ get(n - a - 1));
    }
  }

  @Override
  public Long compute(final Long n) {
    if (n == 0 || n == -1) {
      return 0L;
    }
    final HashSet<Long> seen = new HashSet<>();
    if (n > 0) {
      augment(seen, n);
      augmentTilde(seen, n);
    } else {
      augment(seen, -n);
    }
    return LongUtils.mex(seen);
  }

  private long mN = -1;

  @Override
  public Z next() {
    final Long key = ++mN;
    return Z.valueOf(get(key));
  }
}
