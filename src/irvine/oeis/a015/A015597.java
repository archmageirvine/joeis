package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015597 a(n) = 11 a(n-1) + 5 a(n-2).
 * @author Sean A. Irvine
 */
public class A015597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015597() {
    super(new long[] {5, 11}, new long[] {0, 1});
  }
}
