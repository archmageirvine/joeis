package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281500.
 * @author Sean A. Irvine
 */
public class A281500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281500() {
    super(new long[] {-4, 0, 5, 0}, new long[] {2, 3, 14, 15});
  }
}
