package irvine.oeis.a046;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a000.A000213;
import irvine.oeis.memory.MemorySequence;

/**
 * A046733 Periods for divisibility of A000213 by n.
 * @author Sean A. Irvine
 */
public class A046733 extends A046735 {

  private final ArrayList<Long> mNondivisors = new ArrayList<>();
  {
    super.next(); // We handle evens directly
    mNondivisors.add(super.next().longValue());
  }
  private long mN = 0;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return Z.ONE;
    }
    while (mN > mNondivisors.get(mNondivisors.size() - 1)) {
      mNondivisors.add(super.next().longValue());
    }
    for (final long t : mNondivisors) {
      if (mN % t == 0) {
        return Z.ONE;
      }
    }
    final MemorySequence a = MemorySequence.cachedSequence(new A000213());
    int first = -1;
    int k = 0;
    while (true) {
      ++k;
      if (a.a(k).mod(mN) == 0) {
        if (first == -1) {
          first = k;
        } else {
          final int p = k - first;
          if (a.a(first + 2 * p).mod(mN) == 0
            && a.a(first + 3 * p).mod(mN) == 0) {
            return Z.valueOf(p);
          }
        }
      }
    }
  }
}

