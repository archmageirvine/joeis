package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213380 <code>a(n) = 132*binomial(n,12)</code>.
 * @author Sean A. Irvine
 */
public class A213380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213380() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 132});
  }
}
