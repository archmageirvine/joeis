package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241750 <code>a(n) = n^2 + 15</code>.
 * @author Sean A. Irvine
 */
public class A241750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241750() {
    super(new long[] {1, -3, 3}, new long[] {15, 16, 19});
  }
}
