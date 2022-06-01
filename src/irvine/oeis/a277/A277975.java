package irvine.oeis.a277;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A277975 a(n) = n*x^n + (n-1)*x^(n-1) + . . . + x + 1 for x=5.
 * @author Sean A. Irvine
 */
public class A277975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277975() {
    super(new long[] {25, -35, 11}, new long[] {1, 6, 56});
  }
}
