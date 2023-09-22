package irvine.oeis.a365;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A365001 Dead-end primes in "The Prime Number Maze".
 * @author Sean A. Irvine
 */
public class A365001 extends A000040 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final HashSet<Z> mDeadEnds = new HashSet<>();
  private final HashSet<Z> mSeenWorkspace = new HashSet<>();

  private boolean isSolvable(final Z q) {
    mSeenWorkspace.clear();
    mSeenWorkspace.add(q);
    final TreeSet<Z> priority = new TreeSet<>();
    priority.add(q);
    while (!priority.isEmpty()) {
      final Z p = priority.pollFirst();
      Z a = Z.ONE;
      do {
        a = a.multiply2();
        final Z x = p.xor(a);
        if (x.isProbablePrime() && mSeenWorkspace.add(x)) {
          if (x.add(1).bitCount() == 1) {
            return true; // Found a Mersenne prime
          }
          if (x.compareTo(q) < 0 && !mDeadEnds.contains(x)) {
            return true;
          }
          priority.add(x);
        }
      } while (a.compareTo(p) < 0);
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mVerbose) {
        StringUtils.message("Testing: " + p);
      }
      if (p.isOdd() && !isSolvable(p)) {
        mDeadEnds.add(p);
        return p;
      }
    }
  }
}
