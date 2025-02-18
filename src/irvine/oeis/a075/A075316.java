package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075316 Pair the natural numbers such that the n-th pair is (k, k+p(n)) where k is the smallest number not occurring earlier and p(n) is the n-th prime. (1, 3), (2, 5), (4, 9), (6, 13), (7, 18), (8, 21), (10, 27), (11, 30), (12, 35), (14, 43), ... This is the sequence of the product of the members of every pair.
 * @author Sean A. Irvine
 */
public class A075316 extends A000040 {

  private final Set<Z> mSeen = new HashSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z p = super.next();
    while (true) {
      mN = mN.add(1);
      if (mSeen.add(mN)) {
        final Z q = mN.add(p);
        mSeen.add(q);
        return q.multiply(mN);
      }
    }
  }
}
