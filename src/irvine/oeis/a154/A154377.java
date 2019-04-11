package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154377 <code>a(n) = 25*n^2 + 2*n</code>.
 * @author Sean A. Irvine
 */
public class A154377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154377() {
    super(new long[] {1, -3, 3}, new long[] {27, 104, 231});
  }
}
