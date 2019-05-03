package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291183 p-INVERT of the positive integers, where <code>p(S) = 1 - 4*S + 2*S^2</code>.
 * @author Sean A. Irvine
 */
public class A291183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291183() {
    super(new long[] {-1, 8, -16, 8}, new long[] {4, 22, 116, 608});
  }
}
