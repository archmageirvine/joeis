package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041634 Numerators of continued fraction convergents to sqrt(336).
 * @author Sean A. Irvine
 */
public class A041634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041634() {
    super(new long[] {-1, 0, 110, 0}, new long[] {18, 55, 1998, 6049});
  }
}
