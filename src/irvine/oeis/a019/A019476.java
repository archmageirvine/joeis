package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019476.
 * @author Sean A. Irvine
 */
public class A019476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019476() {
    super(new long[] {-2, 1, 5}, new long[] {2, 10, 51});
  }
}
