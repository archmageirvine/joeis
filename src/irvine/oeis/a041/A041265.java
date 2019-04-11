package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041265 Denominators of continued fraction convergents to <code>sqrt(145)</code>.
 * @author Sean A. Irvine
 */
public class A041265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041265() {
    super(new long[] {1, 24}, new long[] {1, 24});
  }
}
