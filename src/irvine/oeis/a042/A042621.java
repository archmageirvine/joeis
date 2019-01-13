package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042621.
 * @author Sean A. Irvine
 */
public class A042621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042621() {
    super(new long[] {-1, 0, 0, 0, 1680, 0, 0, 0}, new long[] {1, 1, 28, 29, 1652, 1681, 47039, 48720});
  }
}
