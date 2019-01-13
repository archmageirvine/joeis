package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100779.
 * @author Sean A. Irvine
 */
public class A100779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100779() {
    super(new long[] {1, -2, 0, 0, 3, 0, -3, 0, 0, 2}, new long[] {1, 2, 5, 14, 27, 49, 89, 142, 218, 329});
  }
}
