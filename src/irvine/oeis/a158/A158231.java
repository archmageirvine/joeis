package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158231 <code>a(n) = 256*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158231() {
    super(new long[] {-1, 2}, new long[] {257, 513});
  }
}
