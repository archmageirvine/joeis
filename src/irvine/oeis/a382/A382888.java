package irvine.oeis.a382;
// Generated by gen_seq4.pl 2025-07-11.ack/sintrif at 2025-07-11 21:53

import irvine.math.function.Functions;
import irvine.oeis.a004.A004709;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A382888 The squarefree kernel of the n-th cubefree number.
 * @author Georg Fischer
 */
public class A382888 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A382888() {
    super(1, (term, n) -> Functions.RAD.z(term), "", new A004709());
  }
}
