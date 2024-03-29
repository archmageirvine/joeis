package irvine.oeis.a339;
// Generated by gen_seq4.pl A069877/parmof3 at 2023-07-26 13:08

import irvine.factor.util.FactorUtils;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A339810 a(n) = A046523(A019565(n) - 1).
 * @author Georg Fischer
 */
public class A339810 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A339810() {
    super(1, new A339809().skip(), FactorUtils::leastPrimeSignature);
  }
}
