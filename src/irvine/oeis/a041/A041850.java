package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041850 Numerators of continued fraction convergents to <code>sqrt(447)</code>.
 * @author Sean A. Irvine
 */
public class A041850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041850() {
    super(new long[] {-1, 0, 296, 0}, new long[] {21, 148, 6237, 43807});
  }
}
