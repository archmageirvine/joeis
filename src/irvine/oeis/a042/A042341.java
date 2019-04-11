package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042341 Denominators of continued fraction convergents to <code>sqrt(697)</code>.
 * @author Sean A. Irvine
 */
public class A042341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042341() {
    super(new long[] {1, 0, 0, 264, 0, 0}, new long[] {1, 2, 5, 262, 529, 1320});
  }
}
