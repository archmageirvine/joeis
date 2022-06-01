package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274603 Numbers n such that 2*n+1 and 3*n+1 are both triangular numbers.
 * @author Sean A. Irvine
 */
public class A274603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274603() {
    super(new long[] {1, -99, 99}, new long[] {45, 4455, 436590});
  }
}
