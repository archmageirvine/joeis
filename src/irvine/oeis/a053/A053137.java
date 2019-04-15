package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053137 Binomial coefficients <code>C(2*n+8,8)</code>.
 * @author Sean A. Irvine
 */
public class A053137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053137() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 45, 495, 3003, 12870, 43758, 125970, 319770, 735471});
  }
}
