package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155605.
 * @author Sean A. Irvine
 */
public class A155605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155605() {
    super(new long[] {21, -31, 11}, new long[] {1, 9, 57});
  }
}
