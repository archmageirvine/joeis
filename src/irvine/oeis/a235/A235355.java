package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235355 0 followed by the sum of <code>(1),(2), (3,4),(5,6), (7,8,9),(10,11,12)</code> from the natural numbers.
 * @author Sean A. Irvine
 */
public class A235355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235355() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 1, 2, 7, 11, 24, 33});
  }
}
