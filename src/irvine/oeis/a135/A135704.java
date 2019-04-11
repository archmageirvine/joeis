package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135704 <code>a(n) = 7*n^2 + 4*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A135704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135704() {
    super(new long[] {1, -3, 3}, new long[] {4, 1, 12});
  }
}
