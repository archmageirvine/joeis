package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189739 a(1)=3, a(2)=5, a(n)=3*a(n-1) + 5*a(n-2).
 * @author Sean A. Irvine
 */
public class A189739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189739() {
    super(1, new long[] {5, 3}, new long[] {3, 5});
  }
}
