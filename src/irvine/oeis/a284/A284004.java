package irvine.oeis.a284;
// Generated by gen_seq4.pl A069877/parmof3 at 2023-07-26 13:08

import irvine.factor.util.FactorUtils;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A284004 a(n) = A046523(A284003(n)).
 * @author Georg Fischer
 */
public class A284004 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A284004() {
    super(0, new A284003(), FactorUtils::leastPrimeSignature);
  }
}
