package irvine.oeis.a198;
// manually recpos at 2023-09-10 18:06

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a066.A066674;

/**
 * A198034 Positions of records in A125878.
 * @author Georg Fischer
 */
public class A198034 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A198034() {
    super(1, new A066674(), 1);
  }
}
