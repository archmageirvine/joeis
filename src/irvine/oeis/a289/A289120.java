package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289120 <code>a(n)</code> is the number of odd integers divisible by <code>7 in ]2*(n-1)^2, 2*n^2[</code>.
 * @author Sean A. Irvine
 */
public class A289120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289120() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 1, 0, 1, 2, 1, 2});
  }
}
