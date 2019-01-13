package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225827.
 * @author Sean A. Irvine
 */
public class A225827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225827() {
    super(new long[] {256, -96, -24, 12}, new long[] {1, 6, 24, 168});
  }
}
