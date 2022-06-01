package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028859 a(n+2) = 2*a(n+1) + 2*a(n); a(0) = 1, a(1) = 3.
 * @author Sean A. Irvine
 */
public class A028859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028859() {
    super(new long[] {2, 2}, new long[] {1, 3});
  }
}
