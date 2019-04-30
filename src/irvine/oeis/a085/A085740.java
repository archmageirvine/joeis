package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085740 <code>a(n) = T(n)^2 - n^2</code>, where <code>T(n)</code> is a triangular number.
 * @author Sean A. Irvine
 */
public class A085740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085740() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 5, 27, 84});
  }
}
