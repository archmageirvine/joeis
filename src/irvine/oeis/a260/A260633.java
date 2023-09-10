package irvine.oeis.a260;
// manually recval at 2023-09-10 18:32

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a008.A008480;

/**
 * A260633 Numbers that set new records for the most ordered prime factorizations.
 * @author Georg Fischer
 */
public class A260633 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A260633() {
    super(1, new A008480(), 1);
  }
}
