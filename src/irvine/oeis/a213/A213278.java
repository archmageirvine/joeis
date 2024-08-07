package irvine.oeis.a213;
// Generated by gen_seq4.pl 2024-07-05/sintrif at 2024-07-05 23:59

import irvine.math.function.Functions;
import irvine.oeis.a001.A001175;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A213278 Least common multiple of A001175(n) and n.
 * @author Georg Fischer
 */
public class A213278 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A213278() {
    super(1, (term, n) -> Functions.LCM.z(term, n), "", new A001175());
  }
}
