package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053347 a(n) = binomial(n+7, 7)*(n+4)/4.
 * @author Sean A. Irvine
 */
public class A053347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053347() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 10, 54, 210, 660, 1782, 4290, 9438, 19305});
  }
}
