package irvine.oeis.a178;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A178607 Largest prime &lt; n!! (double factorial of n).
 * @author Georg Fischer
 */
public class A178607 extends LambdaSequence {

  /** Construct the sequence. */
  public A178607() {
    super(3, n -> Functions.PREV_PRIME.z(Functions.MULTIFACTORIAL.z(2, n)));
  }
}
