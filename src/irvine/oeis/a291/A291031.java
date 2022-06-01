package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291031 p-INVERT of the positive integers, where p(S) = 1 - 3*S + 2*S^3.
 * @author Sean A. Irvine
 */
public class A291031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291031() {
    super(new long[] {-1, 9, -27, 36, -27, 9}, new long[] {3, 15, 70, 321, 1461, 6624});
  }
}
