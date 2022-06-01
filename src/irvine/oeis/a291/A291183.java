package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291183 p-INVERT of the positive integers, where p(S) = 1 - 4*S + 2*S^2.
 * @author Sean A. Irvine
 */
public class A291183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291183() {
    super(new long[] {-1, 8, -16, 8}, new long[] {4, 22, 116, 608});
  }
}
