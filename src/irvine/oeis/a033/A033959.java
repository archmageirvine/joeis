package irvine.oeis.a033;

import irvine.oeis.RecordSequence;
import irvine.oeis.a006.A006667;

/**
 * A033959 Record number of steps to reach 1 in '3x+1' problem, corresponding to starting values in A033958.
 * @author Sean A. Irvine
 */
public class A033959 extends RecordSequence {

  /** Construct the sequence. */
  public A033959() {
    super(new A006667());
  }
}
