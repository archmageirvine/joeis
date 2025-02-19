package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075420 Trajectory of n under the Reverse and Add! operation carried out in base 4 (presumably) does not reach a palindrome.
 * @author Sean A. Irvine
 */
public class A075420 extends Sequence1 {

  // Heuristic
  private static final long SEARCH_LIMIT = Long.parseLong(System.getProperty("oeis.heuristic-limit", "1000"));
  private Z mN = Z.valueOf(195);

  @Override
  public Z next() {
    outer:
    while (true) {
      mN = mN.add(1);
      Z m = mN;
      for (long k = 0; k < SEARCH_LIMIT; ++k) {
        final Z r = Functions.REVERSE.z(4, m);
        if (r.equals(m)) {
          continue outer;
        }
        m = m.add(r);
      }
      return mN;
    }
  }
}
