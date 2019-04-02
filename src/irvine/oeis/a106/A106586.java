package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106586 Digit next to last in squares ending in 6.
 * @author Sean A. Irvine
 */
public class A106586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106586() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {1, 3, 9, 5, 7, 7, 5, 9, 3});
  }
}
