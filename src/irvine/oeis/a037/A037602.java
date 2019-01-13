package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037602.
 * @author Sean A. Irvine
 */
public class A037602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037602() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 12, 108, 973});
  }
}
