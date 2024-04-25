package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153382 a(n) = a(n-1) + 2*a(n-2) - a(n-3) - a(n-4), a(0)=0, a(1)=8, a(2)=10, a(3)=18.
 * @author Sean A. Irvine
 */
public class A153382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153382() {
    super(new long[] {-1, -1, 2, 1}, new long[] {0, 8, 10, 18});
  }
}
