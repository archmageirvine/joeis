package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153175 a(n) = L(7*n)/L(n) where L(n) = Lucas number A000204(n).
 * @author Sean A. Irvine
 */
public class A153175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153175() {
    super(new long[] {-1, 13, 104, -260, -260, 104, 13}, new long[] {29, 281, 6119, 101521, 1875749, 33281921, 599786069});
  }
}
