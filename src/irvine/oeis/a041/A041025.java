package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041025 Denominators of continued fraction convergents to sqrt(17).
 * @author Sean A. Irvine
 */
public class A041025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041025() {
    super(new long[] {1, 8}, new long[] {1, 8});
  }
}
