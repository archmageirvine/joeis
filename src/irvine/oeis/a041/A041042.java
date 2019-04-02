package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041042 Numerators of continued fraction convergents to sqrt(27).
 * @author Sean A. Irvine
 */
public class A041042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041042() {
    super(new long[] {-1, 0, 52, 0}, new long[] {5, 26, 265, 1351});
  }
}
