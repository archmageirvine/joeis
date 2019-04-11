package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041286 Numerators of continued fraction convergents to <code>sqrt(156)</code>.
 * @author Sean A. Irvine
 */
public class A041286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041286() {
    super(new long[] {-1, 0, 50, 0}, new long[] {12, 25, 612, 1249});
  }
}
