package irvine.oeis.a261;
// Generated by gen_seq4.pl 2024-06-23/sintrif at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a032.A032741;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A261447 The number of distinct prime factors of the number of proper divisors of n.
 * @author Georg Fischer
 */
public class A261447 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A261447() {
    super(2, (term, n) -> Functions.OMEGA.z(term), "", new A032741());
  }
}
