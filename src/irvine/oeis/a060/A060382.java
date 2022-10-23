package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence2;
import irvine.util.RuntimeUtils;

/**
 * A060382 In base n, a(n) is the smallest number m that leads to a palindrome-free sequence, using the following process: start with m; reverse the digits and add it to m, repeat. Stop if you reach a palindrome.
 * @author Sean A. Irvine
 */
public class A060382 extends Sequence2 {

  // Heuristic
  private static final long SEARCH_LIMIT = RuntimeUtils.isTest() ? 500 : Long.parseLong(System.getProperty("oeis.heuristic-limit", "5000"));
  private int mBase = 1;

  @Override
  public Z next() {
    ++mBase;
    Z n = Z.valueOf(mBase);
    outer:
    while (true) {
      n = n.add(1);
      Z m = n;
      for (long k = 0; k < SEARCH_LIMIT; ++k) {
        final Z r = ZUtils.reverse(m, mBase);
        if (r.equals(m)) {
          continue outer;
        }
        m = m.add(r);
      }
      return n;
    }
  }
}
