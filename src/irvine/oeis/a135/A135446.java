package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135446.
 * @author Sean A. Irvine
 */
public class A135446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135446() {
    super(new long[] {2, -3, 3}, new long[] {-1, -1, 3});
  }
}
