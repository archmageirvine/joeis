package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041837 Denominators of continued fraction convergents to sqrt(439).
 * @author Sean A. Irvine
 */
public class A041837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041837() {
    super(new long[] {-1, 0, 0, 0, 880, 0, 0, 0}, new long[] {1, 1, 20, 21, 860, 881, 17599, 18480});
  }
}
