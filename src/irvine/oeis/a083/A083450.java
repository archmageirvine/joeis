package irvine.oeis.a083;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a084.A084840;

/**
 * A083450 Positions of records in A084840.
 * @author Sean A. Irvine
 */
public class A083450 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A083450() {
    super(1, 1, new A084840());
  }
}
