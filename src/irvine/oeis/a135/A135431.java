package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135431.
 * @author Sean A. Irvine
 */
public class A135431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135431() {
    super(new long[] {-1, 1, 1, 1}, new long[] {0, 1, 2, 3});
  }
}
