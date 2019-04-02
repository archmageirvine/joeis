package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042241 Denominators of continued fraction convergents to sqrt(646).
 * @author Sean A. Irvine
 */
public class A042241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042241() {
    super(new long[] {-1, 0, 0, 0, 610, 0, 0, 0}, new long[] {1, 2, 5, 12, 605, 1222, 3049, 7320});
  }
}
