package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008612 Molien series of 2-dimensional representation of <code>SL(2,3)</code>.
 * @author Sean A. Irvine
 */
public class A008612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008612() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {1, 0, 0, 1, 1});
  }
}

