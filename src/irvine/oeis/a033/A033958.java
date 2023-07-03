package irvine.oeis.a033;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a006.A006667;

/**
 * A033958 In the '3x+1' problem, these values for the starting value set new records for number of steps to reach 1.
 * @author Sean A. Irvine
 */
public class A033958 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A033958() {
    super(1, new A006667(), 1);
  }
}
