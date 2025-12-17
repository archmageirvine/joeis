package irvine.oeis.a082;

import java.util.Arrays;
import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A082618 Primes pertaining to A082617. a(n) = A082617(n+1)/A082617(n).
 * @author Sean A. Irvine
 */
public class A082618 extends Sequence1 {

  private final HashSet<Z> mUsedPrimes = new HashSet<>();
  private final Sequence mPalindromes = new A002113().skip();
  private Z mA = mPalindromes.next();

  @Override
  public Z next() {
    while (true) {
      final Z p = mPalindromes.next();
      final Z[] qr = p.divideAndRemainder(mA);
      if (qr[1].isZero()) {
        if (qr[0].isProbablePrime() && !mUsedPrimes.contains(qr[0])) {
          mA = p;
          mUsedPrimes.addAll(Arrays.asList(Jaguar.factor(p).toZArray()));
          return qr[0];
        }
      }
    }
  }
}
