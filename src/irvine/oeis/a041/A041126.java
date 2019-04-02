package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041126 Numerators of continued fraction convergents to sqrt(72).
 * @author Sean A. Irvine
 */
public class A041126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041126() {
    super(new long[] {-1, 0, 34, 0}, new long[] {8, 17, 280, 577});
  }
}
