package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289134 <code>a(n) = 21*n^2 - 33*n + 13</code>.
 * @author Sean A. Irvine
 */
public class A289134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289134() {
    super(new long[] {1, -3, 3}, new long[] {1, 31, 103});
  }
}
