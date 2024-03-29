package irvine.oeis.a275;
// Generated by gen_seq4.pl dirtraf/dirtrali at 2024-02-06 22:08

import irvine.oeis.a001.A001222;
import irvine.oeis.a199.A199592;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A275382 Number of odd prime factors (with multiplicity) of generalized Fermat number 11^(2^n) + 1.
 * @author Georg Fischer
 */
public class A275382 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A275382() {
    super(0, new A001222(), new A199592().skip(1), (n, v) -> v.subtract(1), 1);
  }
}
