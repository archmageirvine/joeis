package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291182 p-INVERT of the positive integers, where p(S) = 1 - 3*S + 2*S^2.
 * @author Sean A. Irvine
 */
public class A291182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291182() {
    super(new long[] {-1, 7, -14, 7}, new long[] {3, 13, 52, 203});
  }
}
