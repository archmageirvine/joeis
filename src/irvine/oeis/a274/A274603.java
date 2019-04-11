package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274603 Numbers n such that <code>2*n+1</code> and <code>3*n+1</code> are both triangular numbers.
 * @author Sean A. Irvine
 */
public class A274603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274603() {
    super(new long[] {1, -99, 99}, new long[] {45, 4455, 436590});
  }
}
