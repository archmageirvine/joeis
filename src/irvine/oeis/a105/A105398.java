package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105398 A simple "Fractal Jump Sequence" (FJS).
 * @author Sean A. Irvine
 */
public class A105398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105398() {
    super(4, new long[] {1, 0}, new long[] {4, 8});
  }
}
