package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134927 a(0)=a(1)=1; a(n) = 3*(a(n-1) + a(n-2)).
 * @author Sean A. Irvine
 */
public class A134927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134927() {
    super(new long[] {3, 3}, new long[] {1, 1});
  }
}
