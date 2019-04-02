package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042819 Denominators of continued fraction convergents to sqrt(940).
 * @author Sean A. Irvine
 */
public class A042819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042819() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 8462, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 44, 47, 91, 138, 8371, 8509, 16880, 25389, 372326, 397715, 770041, 1167756});
  }
}
