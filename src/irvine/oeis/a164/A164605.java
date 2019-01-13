package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164605.
 * @author Sean A. Irvine
 */
public class A164605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164605() {
    super(new long[] {-8, 8}, new long[] {1, 20});
  }
}
