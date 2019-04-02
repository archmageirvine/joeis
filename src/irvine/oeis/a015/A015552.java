package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015552 a(n) = 6*a(n-1) + 7*a(n-2), a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A015552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015552() {
    super(new long[] {7, 6}, new long[] {0, 1});
  }
}
