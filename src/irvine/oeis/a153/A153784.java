package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153784 4 times heptagonal numbers: <code>2n(5n-3)</code>.
 * @author Sean A. Irvine
 */
public class A153784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153784() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 28});
  }
}
