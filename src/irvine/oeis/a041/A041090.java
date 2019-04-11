package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041090 Numerators of continued fraction convergents to <code>sqrt(53)</code>.
 * @author Sean A. Irvine
 */
public class A041090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041090() {
    super(new long[] {1, 0, 0, 0, 0, 364, 0, 0, 0, 0}, new long[] {7, 22, 29, 51, 182, 2599, 7979, 10578, 18557, 66249});
  }
}
