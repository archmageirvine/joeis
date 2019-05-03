package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073947 Number of strings over <code>Z_3</code> of length n with trace 0 and subtrace 0.
 * @author Sean A. Irvine
 */
public class A073947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073947() {
    super(new long[] {27, -36, 27, -15, 6}, new long[] {1, 1, 3, 9, 21});
  }
}
