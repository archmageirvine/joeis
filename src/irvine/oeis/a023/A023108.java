package irvine.oeis.a023;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023108 Positive integers which apparently never result in a palindrome under repeated applications of the function A056964(x) = x + (x with digits reversed).
 * @author Sean A. Irvine
 */
public class A023108 extends Sequence1 {

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
        final Z r = Functions.REVERSE.z(m);
        if (r.equals(m)) {
          continue outer;
        }
        m = m.add(r);
      }
      return mN;
    }
  }
}
