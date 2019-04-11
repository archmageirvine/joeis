package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041056 Numerators of continued fraction convergents to <code>sqrt(34)</code>.
 * @author Sean A. Irvine
 */
public class A041056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041056() {
    super(new long[] {-1, 0, 0, 0, 70, 0, 0, 0}, new long[] {5, 6, 29, 35, 379, 414, 2035, 2449});
  }
}
