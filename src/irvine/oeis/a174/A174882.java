package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174882 A <code>(3/2,-1) Somos-4</code> sequence.
 * @author Sean A. Irvine
 */
public class A174882 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174882() {
    super(new long[] {-16, 0, 0, 0}, new long[] {1, 1, -2, -8});
  }
}
