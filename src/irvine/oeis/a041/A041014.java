package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041014 Numerators of continued fraction convergents to sqrt(11).
 * @author Sean A. Irvine
 */
public class A041014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041014() {
    super(new long[] {-1, 0, 20, 0}, new long[] {3, 10, 63, 199});
  }
}
