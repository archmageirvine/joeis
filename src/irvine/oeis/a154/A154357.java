package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154357 <code>a(n) = 25*n^2 - 14*n + 2</code>.
 * @author Sean A. Irvine
 */
public class A154357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154357() {
    super(new long[] {1, -3, 3}, new long[] {2, 13, 74});
  }
}
