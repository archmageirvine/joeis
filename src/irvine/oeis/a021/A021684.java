package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021684.
 * @author Sean A. Irvine
 */
public class A021684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021684() {
    super(new long[] {-270, 417, -169, 23}, new long[] {1, 23, 360, 4810});
  }
}
