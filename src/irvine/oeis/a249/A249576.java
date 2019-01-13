package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249576.
 * @author Sean A. Irvine
 */
public class A249576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249576() {
    super(new long[] {1, 0, 0, 2, 0, 0}, new long[] {0, 1, 0, 1, 1, 2});
  }
}
