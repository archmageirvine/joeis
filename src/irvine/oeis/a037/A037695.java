package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037695.
 * @author Sean A. Irvine
 */
public class A037695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037695() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {1, 6, 27, 108, 433});
  }
}
