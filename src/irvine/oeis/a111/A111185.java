package irvine.oeis.a111;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A111185 Let f(k) denote the largest prime factor of k which is not a palindrome. Sequence gives numbers k such that the sum of the factorials of the digits of k is equal to f(k) reversed.
 * @author Sean A. Irvine
 */
public class A111185 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] p = Jaguar.factor(++mN).toZArray();
      for (int k = p.length - 1; k >= 0; --k) {
        if (!Predicates.PALINDROME.is(p[k])) {
          final long rev = Functions.REVERSE.l(p[k]);
          long m = mN;
          long s = 0;
          while (m != 0 && s <= rev) {
            s += Functions.FACTORIAL.l(m % 10);
            m /= 10;
          }
          if (s == rev) {
            return Z.valueOf(mN);
          }
          break;
        }
      }
    }
  }
}
