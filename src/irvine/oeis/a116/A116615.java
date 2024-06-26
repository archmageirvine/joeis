package irvine.oeis.a116;
// Generated by gen_seq4.pl 2024-06-06/simtraf at 2024-06-06 20:10

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A116615 Values of n such that prime(2n) mod 12 = 7.
 * @author Georg Fischer
 */
public class A116615 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A116615() {
    super(1, new FilterPositionSequence(1, 1, new A000040(), (n, v) -> (n & 1) == 0 && v.mod(12) == 7), v -> v.divide(2));
  }
}
