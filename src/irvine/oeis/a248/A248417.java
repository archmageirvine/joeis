package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248417.
 * @author Sean A. Irvine
 */
public class A248417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248417() {
    super(new long[] {1, -31, -25}, new long[] {3, -25, 563});
  }
}
