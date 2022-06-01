package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015592 a(n) = 10*a(n-1) + 11*a(n-2).
 * @author Sean A. Irvine
 */
public class A015592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015592() {
    super(new long[] {11, 10}, new long[] {0, 1});
  }
}
