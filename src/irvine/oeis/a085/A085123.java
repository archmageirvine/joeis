package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002473;
import irvine.util.string.StringUtils;

/**
 * A085123 Smallest member of A002473 whose digital product = A002473(n), or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A085123 extends A002473 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose.a085123"));
  private static final Z Z21 = Z.valueOf(21);
  private static final Z Z25 = Z.valueOf(25);

  @Override
  public Z next() {
    final Z t = super.next();
    if (t.compareTo(Z21) >= 0 && Functions.GCD.z(t, Z.TEN).isOne()) {
      return Z.ZERO;
    }
    if (t.equals(Z25)) {
      // Assuming a solution for 25 exists, this loop should eventually find it,
      // the number of 1's is known to exceed 1000.
      int ones = -1;
      while (true) {
        final String s = "1".repeat(++ones);
        for (int k = s.length(); k >= 0; --k) {
          for (int j = s.length(); j >= k; --j) {
            final Z v = new Z(s.substring(0, k) + "5" + s.substring(k, j) + "5" + s.substring(j));
            if (Predicates.SMOOTH.is(7, v)) {
              return v;
            }
          }
        }
        if (mVerbose) {
          StringUtils.message("25 no soln with " + ones + " ones");
        }
      }
    }
    final Sequence s = new A002473();
    while (true) {
      final Z u = s.next();
      if (t.equals(Functions.DIGIT_PRODUCT.z(u))) {
        return u;
      }
    }
  }
}
