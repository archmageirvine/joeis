package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041161 Denominators of continued fraction convergents to sqrt(90).
 * @author Sean A. Irvine
 */
public class A041161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041161() {
    super(new long[] {-1, 0, 38, 0}, new long[] {1, 2, 37, 76});
  }
}
