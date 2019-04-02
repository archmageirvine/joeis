package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041654 Numerators of continued fraction convergents to sqrt(346).
 * @author Sean A. Irvine
 */
public class A041654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041654() {
    super(new long[] {1, 0, 0, 0, 0, 186, 0, 0, 0, 0}, new long[] {18, 19, 37, 56, 93, 3404, 3497, 6901, 10398, 17299});
  }
}
