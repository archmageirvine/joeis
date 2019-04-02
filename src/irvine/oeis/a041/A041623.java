package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041623 Denominators of continued fraction convergents to sqrt(330).
 * @author Sean A. Irvine
 */
public class A041623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041623() {
    super(new long[] {-1, 0, 218, 0}, new long[] {1, 6, 217, 1308});
  }
}
