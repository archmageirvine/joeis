package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164611.
 * @author Sean A. Irvine
 */
public class A164611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164611() {
    super(new long[] {-1, 2, -3, 2}, new long[] {1, 3, 5, 2});
  }
}
