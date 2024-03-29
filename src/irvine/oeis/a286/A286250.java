package irvine.oeis.a286;
// Generated by gen_seq4.pl A069877/parmof3 at 2023-07-26 13:08

import irvine.factor.util.FactorUtils;
import irvine.oeis.a245.A245448;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A286250 Filter-sequence: a(n) = A278223(A064216(n)) = A046523((2*A064216(n))-1).
 * @author Georg Fischer
 */
public class A286250 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A286250() {
    super(1, new A245448(), FactorUtils::leastPrimeSignature);
  }
}
