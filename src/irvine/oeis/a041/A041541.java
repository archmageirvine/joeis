package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041541 Denominators of continued fraction convergents to <code>sqrt(287)</code>.
 * @author Sean A. Irvine
 */
public class A041541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041541() {
    super(new long[] {-1, 0, 0, 0, 576, 0, 0, 0}, new long[] {1, 1, 16, 17, 560, 577, 9215, 9792});
  }
}
