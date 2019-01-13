package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190322.
 * @author Sean A. Irvine
 */
public class A190322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190322() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 9, 17, 3});
  }
}
