package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041347 Denominators of continued fraction convergents to <code>sqrt(187)</code>.
 * @author Sean A. Irvine
 */
public class A041347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041347() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 3364, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 40, 83, 123, 3281, 3404, 10089, 134561, 279211, 413772});
  }
}
