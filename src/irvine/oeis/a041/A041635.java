package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041635 Denominators of continued fraction convergents to sqrt(336).
 * @author Sean A. Irvine
 */
public class A041635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041635() {
    super(new long[] {-1, 0, 110, 0}, new long[] {1, 3, 109, 330});
  }
}
