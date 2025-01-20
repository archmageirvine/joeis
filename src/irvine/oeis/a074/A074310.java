package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074310 Digital sum of n = sum of palindromes from the smallest prime factor of n to the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A074310 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z[] p = Jaguar.factor(++mN).toZArray();
      long sum = Functions.DIGIT_SUM.l(mN);
      for (long q = p[0].longValue(); q <= p[p.length - 1].longValue(); ++q) {
        if (Predicates.PALINDROME.is(q)) {
          sum -= q;
        }
        if (sum < 0) {
          break;
        }
      }
      if (sum == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
