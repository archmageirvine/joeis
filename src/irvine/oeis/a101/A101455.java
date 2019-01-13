package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101455.
 * @author Sean A. Irvine
 */
public class A101455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101455() {
    super(new long[] {-1, 0}, new long[] {1, 0});
  }
}
