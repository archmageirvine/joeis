package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189742 a(1)=4, a(2)=3, a(n) = 4*a(n-1) + 3*a(n-2).
 * @author Sean A. Irvine
 */
public class A189742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189742() {
    super(1, new long[] {3, 4}, new long[] {4, 3});
  }
}
