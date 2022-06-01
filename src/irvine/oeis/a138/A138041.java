package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138041 a(1) = 1, a(2) = 10; for n&gt;2, a(n+1) = 4*a(n) + 6*a(n-1). Also a(n) = upper left term in the 2 X 2 matrix [1,3; 3,3].
 * @author Sean A. Irvine
 */
public class A138041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138041() {
    super(new long[] {6, 4}, new long[] {1, 10});
  }
}
