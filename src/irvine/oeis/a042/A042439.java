package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042439 Denominators of continued fraction convergents to sqrt(747).
 * @author Sean A. Irvine
 */
public class A042439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042439() {
    super(new long[] {-1, 0, 164, 0}, new long[] {1, 3, 163, 492});
  }
}
