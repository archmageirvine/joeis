package irvine.oeis.a072;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A072135 Least m such that sqrt(m) has a period 2n continued fraction expansion whose palindrome part concatenates to a palindromic prime.
 * @author Sean A. Irvine
 */
public class A072135 extends Sequence2 {

  private long mN = 2;

  @Override
  public Z next() {
    mN += 2;
    int m = 1;
    while (true) {
      final ContinuedFractionOfSqrtSequence cf = new ContinuedFractionOfSqrtSequence(0, ++m);
      if (cf.getPeriodLength() == mN) {
        cf.next();
        final StringBuilder sb = new StringBuilder();
        boolean ok = true;
        for (int k = 0; k < mN - 1; ++k) {
          final Z t = cf.next();
          if (!Predicates.PALINDROME.is(t)) {
            ok = false;
            break;
          }
          sb.append(t);
        }
        if (ok && new Z(sb).isProbablePrime()) {
          return Z.valueOf(m);
        }
      }
    }
  }
}
