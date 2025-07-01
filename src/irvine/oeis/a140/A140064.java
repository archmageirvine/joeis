package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140064 a(n) = (9*n^2 - 5*n + 2)/2.
 * @author Sean A. Irvine
 */
public class A140064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140064() {
    super(0, new long[] {1, -3, 3}, new long[] {1, 3, 14});
  }
}
