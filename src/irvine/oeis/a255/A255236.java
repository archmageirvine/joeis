package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255236 All positive solutions x of the second class of the Pell equation <code>x^2 - 2*y^2 = -7</code>.
 * @author Sean A. Irvine
 */
public class A255236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255236() {
    super(new long[] {-1, 6}, new long[] {5, 31});
  }
}
