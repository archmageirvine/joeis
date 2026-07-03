package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A085631 Let b(n)=product of exponents of prime factorization of n. Sequence gives palindromes n such that b(n) is also palindromic and sets a new record.
 * @author Sean A. Irvine
 */
public class A085631 extends Sequence1 {

  private final Sequence mPalindromes = new A002113().skip();
  private Z mRecord = Z.ZERO;

  private boolean is(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(fs.getExponent(p));
    }
    if (prod.compareTo(mRecord) > 0 && Predicates.PALINDROME.is(prod)) {
      mRecord = prod;
      return true;
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = mPalindromes.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
