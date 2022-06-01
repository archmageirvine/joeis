package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159289 a(n+1) = 5*a(n) - 2*a(n-1).
 * @author Sean A. Irvine
 */
public class A159289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159289() {
    super(new long[] {-2, 5}, new long[] {5, 21});
  }
}
