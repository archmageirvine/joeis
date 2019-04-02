package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042101 Denominators of continued fraction convergents to sqrt(574).
 * @author Sean A. Irvine
 */
public class A042101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042101() {
    super(new long[] {-1, 0, 0, 0, 1150, 0, 0, 0}, new long[] {1, 1, 23, 24, 1127, 1151, 26449, 27600});
  }
}
