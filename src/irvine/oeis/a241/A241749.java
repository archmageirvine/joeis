package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241749 <code>a(n) = n^2 + 13</code>.
 * @author Sean A. Irvine
 */
public class A241749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241749() {
    super(new long[] {1, -3, 3}, new long[] {13, 14, 17});
  }
}
