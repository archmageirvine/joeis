package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136412 a(n) = (5*4^n + 1)/3.
 * @author Sean A. Irvine
 */
public class A136412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136412() {
    super(new long[] {-4, 5}, new long[] {2, 7});
  }
}
