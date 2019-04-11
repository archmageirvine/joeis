package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130612 Sum of the first <code>10^n</code> squares.
 * @author Sean A. Irvine
 */
public class A130612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130612() {
    super(new long[] {1000000, -111000, 1110}, new long[] {1, 385, 338350});
  }
}
