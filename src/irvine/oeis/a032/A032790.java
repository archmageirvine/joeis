package irvine.oeis.a032;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032790 Palindromic quotients (k*(k+1)*(k+2)) / (k+(k+1)+(k+2)).
 * @author Sean A. Irvine
 */
public class A032790 extends Sequence1 {

  private long mN = -1;

  protected long t() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z a = Z.ONE;
      for (long k = 0; k <= t(); ++k) {
        a = a.multiply(mN + k);
      }
      final Z[] qr = a.divideAndRemainder(Z.valueOf((t() + 1) * mN + t() * (t() + 1) / 2));
      if (qr[1].isZero() && Predicates.PALINDROME.is(qr[0])) {
        return qr[0];
      }
    }
  }
}

