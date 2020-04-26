package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213243 Number of nonzero elements in <code>GF(2^n)</code> that are cubes.
 * @author Sean A. Irvine
 */
public class A213243 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A213243() {
    super(new long[] {-4, 0, 5, 0}, new long[] {1, 1, 7, 5});
  }
}
