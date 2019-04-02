package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042371 Denominators of continued fraction convergents to sqrt(712).
 * @author Sean A. Irvine
 */
public class A042371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042371() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 3202, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 19, 41, 60, 3161, 3221, 9603, 60839, 131281, 192120});
  }
}
