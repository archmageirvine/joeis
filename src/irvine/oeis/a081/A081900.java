package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081900.
 * @author Sean A. Irvine
 */
public class A081900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081900() {
    super(new long[] {3125, -3125, 1250, -250, 25}, new long[] {1, 9, 71, 519, 3606});
  }
}
