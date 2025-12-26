package irvine.oeis.a391;

import java.util.HashSet;
import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391539 Positive integer multipliers m such that each integer can be written as a sum of progressive powers 5^t multiplied by coefficients in (-m,-1,0,1,m).
 * @author Sean A. Irvine
 */
public class A391539 extends Sequence1 {

  // After Heinrich Puschmann

  private long mN = 1;

  private boolean is(final long n) {
    if (n < 2) {
      return false;
    }
    final long r = n % 5;
    if (r == 0 || r == 1 || r == 4) {
      return false;
    }
    final LinkedList<Long> untested = new LinkedList<>();
    for (long k = 2; k <= n / 4; ++k) {
      untested.add(k);
    }
    final HashSet<Long> tested = new HashSet<>();
    tested.add(0L);
    tested.add(1L);
    while (!untested.isEmpty()) {
      long rr = untested.pollFirst();
      final HashSet<Long> rrSeen = new HashSet<>();
      while (!tested.contains(rr)) {
        rrSeen.add(rr);
        untested.remove(rr);
        final long res = rr % 5;
        if (res == 1) {
          --rr;
        } else if (res == 4) {
          ++rr;
        } else if (res == r) {
          rr -= n;
        } else if (res == (5 - r)) {
          rr += n;
        }
        rr /= 5;
        rr = Math.abs(rr);
        if (rrSeen.contains(rr)) {
          return false;
        }
      }
      tested.addAll(rrSeen);
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

