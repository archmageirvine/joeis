package irvine.oeis.a033;

import irvine.oeis.RecordPositionSequence;

/**
 * A033495 Initial number for record sum of numbers in trajectory of <code>3x+1</code> problem.
 * @author Sean A. Irvine
 */
public class A033495 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A033495() {
    super(new A033493(), 1);
  }
}
