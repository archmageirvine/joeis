package irvine.oeis.a006;

import irvine.oeis.RecordPositionSequence;

/**
 * A006877 In the '3x+1' problem, these values for the starting value set new records for number of steps to reach 1.
 * @author Sean A. Irvine
 */
public class A006877 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A006877() {
    super(new A006577(), 1);
  }
}
