package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015593 a(n) = 11*a(n-1) + 2*a(n-2).
 * @author Sean A. Irvine
 */
public class A015593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015593() {
    super(new long[] {2, 11}, new long[] {0, 1});
  }
}
