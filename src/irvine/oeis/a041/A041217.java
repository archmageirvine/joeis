package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041217 Denominators of continued fraction convergents to sqrt(119).
 * @author Sean A. Irvine
 */
public class A041217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041217() {
    super(new long[] {-1, 0, 0, 0, 240, 0, 0, 0}, new long[] {1, 1, 10, 11, 230, 241, 2399, 2640});
  }
}
