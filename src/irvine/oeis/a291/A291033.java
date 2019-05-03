package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291033 p-INVERT of the positive integers, where <code>p(S) = 1 - 6*S</code>.
 * @author Sean A. Irvine
 */
public class A291033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291033() {
    super(new long[] {-1, 8}, new long[] {6, 48});
  }
}
