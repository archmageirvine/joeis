package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190576.
 * @author Sean A. Irvine
 */
public class A190576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190576() {
    super(new long[] {1, -3, 3}, new long[] {1, 9, 19});
  }
}
