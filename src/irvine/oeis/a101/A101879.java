package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101879.
 * @author Sean A. Irvine
 */
public class A101879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101879() {
    super(new long[] {1, -5, 5}, new long[] {1, 1, 2});
  }
}
