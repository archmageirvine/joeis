package irvine.oeis.a087;

import irvine.factor.util.FactorUtils;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A087305 Smallest n-digit non-palindromic number such that it and its digit reversal have the same prime signature.
 * @author Sean A. Irvine
 */
public class A087305 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.multiply(10);
    Z t = mN;
    while (Predicates.PALINDROME.is(t) || !FactorUtils.leastPrimeSignature(t).equals(FactorUtils.leastPrimeSignature(Functions.REVERSE.z(t)))) {
      t = t.add(1);
    }
    return t;
  }
}
