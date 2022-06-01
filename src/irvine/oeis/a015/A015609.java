package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015609 a(n) = 11*a(n-1) + 12*a(n-2).
 * @author Sean A. Irvine
 */
public class A015609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015609() {
    super(new long[] {12, 11}, new long[] {0, 1});
  }
}
