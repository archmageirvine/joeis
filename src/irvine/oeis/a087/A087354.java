package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087354 Smallest square which is the concatenation of n nonzero squares.
 * @author Sean A. Irvine
 */
public class A087354 extends Sequence1 {

  private int mN = 0;

  private boolean is(final String s, final int k, final int remaining) {
    if (remaining == 0) {
      return k == 0;
    }
    for (int j = k - 1; j + 1 >= remaining; --j) {
      if (s.charAt(j) != '0' && Predicates.SQUARE.is(Long.parseLong(s.substring(j, k))) && is(s, j, remaining - 1)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    Z t = Functions.CEIL_SQRT.z(new Z("1".repeat(++mN)));
    while (true) {
      final Z s = t.square();
      final String str = s.toString();
      if (is(str, str.length(), mN)) {
        return s;
      }
      t = t.add(1);
    }
  }
}
