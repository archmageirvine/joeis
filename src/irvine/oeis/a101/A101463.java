package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101463.
 * @author Sean A. Irvine
 */
public class A101463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101463() {
    super(new long[] {-1, 0, -5, 0}, new long[] {1, 2, -4, -9});
  }
}
