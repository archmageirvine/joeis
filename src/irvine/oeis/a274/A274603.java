package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274603.
 * @author Sean A. Irvine
 */
public class A274603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274603() {
    super(new long[] {1, -99, 99}, new long[] {45, 4455, 436590});
  }
}
