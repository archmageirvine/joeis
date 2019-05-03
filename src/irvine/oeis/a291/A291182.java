package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291182 p-INVERT of the positive integers, where <code>p(S) = 1 - 3*S + 2*S^2</code>.
 * @author Sean A. Irvine
 */
public class A291182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291182() {
    super(new long[] {-1, 7, -14, 7}, new long[] {3, 13, 52, 203});
  }
}
