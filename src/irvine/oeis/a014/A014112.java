package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014112.
 * @author Sean A. Irvine
 */
public class A014112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014112() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 2, 7, 14, 27});
  }
}
