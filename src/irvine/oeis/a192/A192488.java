package irvine.oeis.a192;
// manually recpos at 2023-09-10 09:19

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a092.A092517;

/**
 * A192488 Numbers that set records for number of divisors of n(n-1).
 * @author Georg Fischer
 */
public class A192488 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A192488() {
    super(1, new A092517(), 2);
  }
}
