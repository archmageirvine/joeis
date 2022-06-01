package irvine.oeis.a235;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A235643 Total number of sides of a tetraflake-like fractal after n iterations, a(1) = 16 (see comments).
 * @author Sean A. Irvine
 */
public class A235643 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A235643() {
    super(new long[] {-7, 6}, new long[] {16, 68});
  }
}
