package irvine.oeis.a260;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A260637 Sums of seven consecutive squares: a(n) = n^2 + (n+1)^2 + (n+2)^2 + (n+3)^2 + (n+4)^2 + (n+5)^2 + (n+6)^2.
 * @author Sean A. Irvine
 */
public class A260637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260637() {
    super(new long[] {1, -3, 3}, new long[] {28, 35, 56});
  }
}
