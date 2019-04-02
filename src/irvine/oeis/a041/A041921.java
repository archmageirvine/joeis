package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041921 Denominators of continued fraction convergents to sqrt(482).
 * @author Sean A. Irvine
 */
public class A041921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041921() {
    super(new long[] {-1, 0, 0, 0, 966, 0, 0, 0}, new long[] {1, 1, 21, 22, 945, 967, 20285, 21252});
  }
}
