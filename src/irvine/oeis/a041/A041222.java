package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041222 Numerators of continued fraction convergents to <code>sqrt(123)</code>.
 * @author Sean A. Irvine
 */
public class A041222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041222() {
    super(new long[] {-1, 0, 244, 0}, new long[] {11, 122, 2695, 29767});
  }
}
