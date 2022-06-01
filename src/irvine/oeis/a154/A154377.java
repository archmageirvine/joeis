package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154377 a(n) = 25*n^2 + 2*n.
 * @author Sean A. Irvine
 */
public class A154377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154377() {
    super(new long[] {1, -3, 3}, new long[] {27, 104, 231});
  }
}
