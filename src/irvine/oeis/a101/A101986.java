package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101986.
 * @author Sean A. Irvine
 */
public class A101986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101986() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 2, 9, 23});
  }
}
