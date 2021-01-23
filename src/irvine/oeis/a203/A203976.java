package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203976 a(n) = 3*a(n-2) - a(n-4), a(0)=0, a(1)=1, a(2)=5, a(3)=4.
 * @author Sean A. Irvine
 */
public class A203976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203976() {
    super(new long[] {-1, 0, 3, 0}, new long[] {0, 1, 5, 4});
  }
}
