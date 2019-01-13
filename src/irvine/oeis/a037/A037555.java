package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037555.
 * @author Sean A. Irvine
 */
public class A037555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037555() {
    super(new long[] {-6, 1, 0, 6}, new long[] {2, 13, 79, 476});
  }
}
