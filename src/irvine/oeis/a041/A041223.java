package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041223.
 * @author Sean A. Irvine
 */
public class A041223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041223() {
    super(new long[] {-1, 0, 244, 0}, new long[] {1, 11, 243, 2684});
  }
}
