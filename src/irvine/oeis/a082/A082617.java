package irvine.oeis.a082;

import java.util.Arrays;
import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A082617 a(1) = 1, then squarefree palindromes such that a(n+1) = p*a(n) where p is a prime not dividing any previous term.
 * @author Sean A. Irvine
 */
public class A082617 extends Sequence1 {

  private final HashSet<Z> mUsedPrimes = new HashSet<>();
  private final Sequence mPalindromes = new A002113().skip();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = mPalindromes.next();
      return mA;
    }
    while (true) {
      final Z p = mPalindromes.next();
      final Z[] qr = p.divideAndRemainder(mA);
      if (qr[1].isZero()) {
        if (qr[0].isProbablePrime() && !mUsedPrimes.contains(qr[0])) {
          mA = p;
          mUsedPrimes.addAll(Arrays.asList(Jaguar.factor(p).toZArray()));
          return p;
        }
      }
    }
  }
}
