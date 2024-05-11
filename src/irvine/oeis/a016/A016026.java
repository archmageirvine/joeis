package irvine.oeis.a016;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016026 Smallest base relative to which n is palindromic.
 * @author Sean A. Irvine
 */
public class A016026 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int base = 1;
    while (true) {
      final int base1 = ++base;
      if (Predicates.PALINDROME.is(base1, mN)) {
        return Z.valueOf(base);
      }
    }
  }
}
