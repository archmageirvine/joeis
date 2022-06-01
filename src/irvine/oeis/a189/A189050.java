package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189050 a(n) = if n even then P((n-2)/2)+P(n/2) otherwise 3*P((n+1)/2)+P((n-1)/2) where P(i) are the Pell numbers (A000129).
 * @author Sean A. Irvine
 */
public class A189050 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189050() {
    super(new long[] {1, 0, 2, 0}, new long[] {3, 1, 7, 3});
  }
}
