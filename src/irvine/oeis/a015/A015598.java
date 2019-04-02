package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015598 a(n) = 11 a(n-1) + 6 a(n-2).
 * @author Sean A. Irvine
 */
public class A015598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015598() {
    super(new long[] {6, 11}, new long[] {0, 1});
  }
}
