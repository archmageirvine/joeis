package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015581 a(n) = 9*a(n-1) + 5*a(n-2).
 * @author Sean A. Irvine
 */
public class A015581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015581() {
    super(new long[] {5, 9}, new long[] {0, 1});
  }
}
