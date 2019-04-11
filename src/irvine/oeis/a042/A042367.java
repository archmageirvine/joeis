package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042367 Denominators of continued fraction convergents to <code>sqrt(710)</code>.
 * @author Sean A. Irvine
 */
public class A042367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042367() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 2558, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 14, 17, 31, 48, 2527, 2575, 5102, 7677, 35810, 43487, 79297, 122784});
  }
}
