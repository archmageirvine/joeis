package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015440 a(n) = a(n-1) + 5*a(n-2), with a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A015440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015440() {
    super(new long[] {5, 1}, new long[] {1, 1});
  }
}
