package irvine.oeis.a268;
// manually recpos at 2023-09-10 18:06

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a004.A004290;

/**
 * A268610 Indices of records in A004290.
 * @author Georg Fischer
 */
public class A268610 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A268610() {
    super(1, new A004290(), 1);
  }
}
