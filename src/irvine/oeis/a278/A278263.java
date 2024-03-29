package irvine.oeis.a278;
// Generated by gen_seq4.pl A069877/parmof3 at 2023-07-26 13:08

import irvine.factor.util.FactorUtils;
import irvine.oeis.a064.A064413;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A278263 Least number with the same prime signature as the n-th term of EKG-sequence: a(n) = A046523(A064413(n)).
 * @author Georg Fischer
 */
public class A278263 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A278263() {
    super(1, new A064413(), FactorUtils::leastPrimeSignature);
  }
}
