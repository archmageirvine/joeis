package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281899 <code>a(n) = n + 6*floor(n/3)</code>.
 * @author Sean A. Irvine
 */
public class A281899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281899() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 2, 9});
  }
}
