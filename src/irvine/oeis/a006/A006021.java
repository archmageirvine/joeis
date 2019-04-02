package irvine.oeis.a006;

import java.util.HashSet;
import java.util.Set;

import irvine.math.MemoryFunction;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006021 The game of contours.
 * @author Sean A. Irvine
 */
public class A006021 extends MemoryFunction<Long, Long> implements Sequence {

  // Uses non-negative indices for n and negative indices for tilde n
  // This sequence is actually periodic so a simpler implementation is possible

  private void augment(final Set<Long> seen, final long n) {
    for (long a = 1; a < n; a++) {
      // n -> a + tilde b where a + b == n - 1
      seen.add(getValue(-a) ^ getValue(n - a - 1));
    }
  }

  private void augmentTilde(final Set<Long> seen, final long n) {
    for (long a = 0; a < n; a++) {
      // tilde n -> tilde a + tilde b where a + b == n - 1
      seen.add(getValue(a) ^ getValue(n - a - 1));
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
    return A006016.mex(seen);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(getValue(++mN));
  }
}
