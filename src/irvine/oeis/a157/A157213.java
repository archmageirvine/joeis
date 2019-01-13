package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157213.
 * @author Sean A. Irvine
 */
public class A157213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157213() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {97, 137, 277, 305, 685, 1565});
  }
}
