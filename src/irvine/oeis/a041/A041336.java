package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041336 Numerators of continued fraction convergents to sqrt(182).
 * @author Sean A. Irvine
 */
public class A041336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041336() {
    super(new long[] {-1, 0, 54, 0}, new long[] {13, 27, 715, 1457});
  }
}
