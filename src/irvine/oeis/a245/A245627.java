package irvine.oeis.a245;
// Generated by gen_seq4.pl 2024-06-23/sintrif at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a008.A008593;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A245627 Base 10 digit sum of 11*n.
 * @author Georg Fischer
 */
public class A245627 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A245627() {
    super(0, (term, n) -> Functions.DIGIT_SUM.z(10, term), "", new A008593());
  }
}
