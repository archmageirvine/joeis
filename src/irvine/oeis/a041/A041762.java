package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041762 Numerators of continued fraction convergents to sqrt(402).
 * @author Sean A. Irvine
 */
public class A041762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041762() {
    super(new long[] {-1, 0, 802, 0}, new long[] {20, 401, 16060, 321601});
  }
}
