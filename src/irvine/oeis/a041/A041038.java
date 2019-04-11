package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041038 Numerators of continued fraction convergents to <code>sqrt(24)</code>.
 * @author Sean A. Irvine
 */
public class A041038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041038() {
    super(new long[] {-1, 0, 10, 0}, new long[] {4, 5, 44, 49});
  }
}
