package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000668;

/**
 * A053648 Scan decimal expansion of Mersenne primes (A000668), recording all primes seen.
 * @author Sean A. Irvine
 */
public class A053648 extends A000668 {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final String s = super.next().toString();
      for (int k = 0; k < s.length(); ++k) {
        for (int j = k + 1; j <= s.length(); ++j) {
          final Z t = new Z(s.substring(k, j));
          if (t.isProbablePrime() && !mSeen.contains(t)) {
            mA.add(t);
          }
        }
      }
    }
    final Z res = mA.pollFirst();
    mSeen.add(res);
    return res;
  }
}
