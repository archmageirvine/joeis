package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270109.
 * @author Sean A. Irvine
 */
public class A270109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270109() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 7, 20, 47});
  }
}
