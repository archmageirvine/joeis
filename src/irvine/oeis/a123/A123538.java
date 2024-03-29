package irvine.oeis.a123;
// Generated by gen_seq4.pl filtpos at 2023-09-08 10:19

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a064.A064168;

/**
 * A123538 Numbers n such that A064168(n) is prime.
 * @author Georg Fischer
 */
public class A123538 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A123538() {
    super(1, 1, new A064168(), PRIME);
  }
}
