package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189732 a(1)=1,  a(2)=5, a(n) = a(n-1) + 5*a(n-2).
 * @author Sean A. Irvine
 */
public class A189732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189732() {
    super(1, new long[] {5, 1}, new long[] {1, 5});
  }
}
