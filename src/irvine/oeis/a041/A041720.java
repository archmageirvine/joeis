package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041720 Numerators of continued fraction convergents to <code>sqrt(380)</code>.
 * @author Sean A. Irvine
 */
public class A041720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041720() {
    super(new long[] {-1, 0, 78, 0}, new long[] {19, 39, 1501, 3041});
  }
}
