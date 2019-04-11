package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185918 <code>a(n) = 12*n^2 - 2*n - 1</code>.
 * @author Sean A. Irvine
 */
public class A185918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185918() {
    super(new long[] {1, -3, 3}, new long[] {-1, 9, 43});
  }
}
