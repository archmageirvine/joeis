package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041313 Denominators of continued fraction convergents to sqrt(170).
 * @author Sean A. Irvine
 */
public class A041313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041313() {
    super(new long[] {1, 26}, new long[] {1, 26});
  }
}
