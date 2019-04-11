package irvine.oeis.a068;

import irvine.oeis.LinearRecurrence;

/**
 * A068722 Number of solenoidal flows (flow in = flow out) in <code>a 3</code> X 3 square array with integer velocities <code>-n .. n</code>.
 * @author Sean A. Irvine
 */
public class A068722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068722() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 35, 247, 925, 2501});
  }
}
