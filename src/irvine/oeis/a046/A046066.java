package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a005.A005235;

/**
 * A046066 Fortunate primes (A005235) in numerical order with duplicates removed.
 * @author Sean A. Irvine
 */
public class A046066 extends A005235 {

  // Heuristic sort an unique
  private static final int HEURISTIC_LOOKAHEAD = 20;
  private final TreeSet<Z> mDone = new TreeSet<>();
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.size() < HEURISTIC_LOOKAHEAD) {
      final Z t = super.next();
      if (mA.isEmpty() || t.compareTo(mA.first()) >= 0) {
        mA.add(t);
      } else if (!mDone.contains(t)) {
        throw new RuntimeException("Heuristic failed: " + t + " should have been output earlier");
      }
    }
    final Z r = mA.pollFirst();
    mDone.add(r);
    return r;
  }
}
