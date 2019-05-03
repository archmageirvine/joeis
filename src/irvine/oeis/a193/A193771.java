package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193771 Expansion of <code>1 / (1 - x - x^3 + x^6)</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A193771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193771() {
    super(new long[] {-1, 0, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3, 4});
  }
}
