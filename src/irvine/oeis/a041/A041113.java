package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041113 Denominators of continued fraction convergents to sqrt(65).
 * @author Sean A. Irvine
 */
public class A041113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041113() {
    super(new long[] {1, 16}, new long[] {1, 16});
  }
}
