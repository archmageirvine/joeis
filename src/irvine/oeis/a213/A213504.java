package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213504.
 * @author Sean A. Irvine
 */
public class A213504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213504() {
    super(new long[] {1, 0, -8, -2, 15, -2, -10, 6}, new long[] {1, 6, 35, 138, 488, 1564, 4733, 13734});
  }
}
