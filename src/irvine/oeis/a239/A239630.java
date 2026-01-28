package irvine.oeis.a239;
// manually 2025-11-09/recpos at 2025-11-09 18:32

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a086.A086275;

/**
 * A239630 Factored over the Gaussian integers, the least number having n prime factors, excluding units 1, -1, i, and -i.
 * @author Georg Fischer
 */
public class A239630 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A239630() {
    super(1, 1, new A086275());
    next();
  }
}
