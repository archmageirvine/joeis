package irvine.oeis.a083;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002113;
import irvine.oeis.a025.A025487;

/**
 * A083435 Palindromes with distinct prime signatures that occur naturally. Smallest palindrome with a prime signature of A025487(n), or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083435 extends A025487 {

  @Override
  public Z next() {
    final Z sign = FactorUtils.leastPrimeSignature(super.next());
    final Sequence palin = new A002113().skip();
    while (true) {
      final Z p = palin.next();
      final Z sig = FactorUtils.leastPrimeSignature(p);
      if (sign.equals(sig)) {
        return p;
      }
    }
  }
}
