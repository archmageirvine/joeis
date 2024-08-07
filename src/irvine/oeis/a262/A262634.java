package irvine.oeis.a262;
// Generated by gen_seq4.pl 2024-07-13/sintraf at 2024-07-13 23:12

import irvine.math.z.Z;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A262634 Base-10 representation of 0 and the primes at A262633.
 * @author Georg Fischer
 */
public class A262634 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A262634() {
    super(1, (term, n) -> new Z(term.toString(), 4), new A262633());
  }
}
