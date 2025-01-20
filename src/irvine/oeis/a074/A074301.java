package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074301 Numbers n such that (i) the largest prime factor of n is not a palindrome and (ii) the sum of the factorials of the digits of n is equal to the largest prime factor of n reversed.
 * @author Sean A. Irvine
 */
public class A074301 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long gpf = Functions.GPF.l(++mN);
      if (!Predicates.PALINDROME.is(gpf)) {
        final long rev = Functions.REVERSE.l(gpf);
        long m = mN;
        long s = 0;
        while (m != 0 && s <= rev) {
          s += Functions.FACTORIAL.l(m % 10);
          m /= 10;
        }
        if (s == rev) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
