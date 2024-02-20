package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189741 a(1)=4, a(2)=2, a(n) = 4*a(n-1) + 2*a(n-2).
 * @author Sean A. Irvine
 */
public class A189741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189741() {
    super(1, new long[] {2, 4}, new long[] {4, 2});
  }
}
