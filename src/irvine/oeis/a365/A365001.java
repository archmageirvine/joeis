package irvine.oeis.a365;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A365001 Dead-end primes in "The Prime Number Maze".
 * @author Sean A. Irvine
 */
public class A365001 extends A000040 {

  private final HashSet<Z> mDeadEnds = new HashSet<>();
  private final HashSet<Z> mSeenWorkspace = new HashSet<>();

  private boolean isSolvable(final Z q, final Z p) {
    Z a = Z.ONE;
    do {
      a = a.multiply2();
      final Z x = p.xor(a);
      if (x.isProbablePrime() && mSeenWorkspace.add(x)) {
        if (x.add(1).bitCount() == 1) {
          return true; // Found a Mersenne prime
        }
        if (x.compareTo(q) < 0) {
          return !mDeadEnds.contains(x); // Reached a smaller number than the starting point
        }
        if (isSolvable(q, x)) {
          return true;
        }
      }
    } while (a.compareTo(p) < 0);
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      mSeenWorkspace.clear();
      mSeenWorkspace.add(p);
      if (p.isOdd() && !isSolvable(p, p)) {
        mDeadEnds.add(p);
        return p;
      }
    }
  }
}
