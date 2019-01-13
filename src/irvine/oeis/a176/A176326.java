package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176326.
 * @author Sean A. Irvine
 */
public class A176326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176326() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {7, 9, 11, 6, 11, 8});
  }
}
