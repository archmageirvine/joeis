package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190542 7^n - 4^n.
 * @author Sean A. Irvine
 */
public class A190542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190542() {
    super(new long[] {-28, 11}, new long[] {0, 3});
  }
}
