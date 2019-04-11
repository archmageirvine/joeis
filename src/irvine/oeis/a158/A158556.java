package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158556 <code>a(n) = 28*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A158556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158556() {
    super(new long[] {1, -3, 3}, new long[] {1, 29, 113});
  }
}
