package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041438 Numerators of continued fraction convergents to <code>sqrt(235)</code>.
 * @author Sean A. Irvine
 */
public class A041438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041438() {
    super(new long[] {-1, 0, 92, 0}, new long[] {15, 46, 1395, 4231});
  }
}
