package irvine.oeis.a085;

import java.util.HashSet;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A085119 a(n) = number at which the standard Ackermann function mod n stabilizes, or -1 if it does not stabilize.
 * @author Sean A. Irvine
 */
public class A085119 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN == 1969) {
      return Z.NEG_ONE; // Only known value that does not stabilize
    }
    final MemoryFunctionInt2<Long> acker = new MemoryFunctionInt2<>() {
      @Override
      protected Long compute(final int i, final int j) {
        return i == 0 ? (j + 1) % mN : j == 0 ? get(i - 1, 1) : get(i - 1, get(i, j - 1));
      }
    };
    long i = -1;
    while (true) {
      ++i;
      final HashSet<Long> seen = new HashSet<>();
      long j = -1;
      while (seen.add(acker.get(i, ++j))) {
        // do nothing
      }
      if (seen.size() == 1) {
        return Z.valueOf(seen.iterator().next());
      }
    }
  }
}
