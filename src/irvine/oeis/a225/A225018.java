package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225018 Number of cusps in a class of <code>degree-3n</code> complex algebraic surfaces.
 * @author Sean A. Irvine
 */
public class A225018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225018() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {3, 30, 127, 301, 647, 1100, 1851});
  }
}
