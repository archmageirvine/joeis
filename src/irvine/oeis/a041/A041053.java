package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041053 Denominators of continued fraction convergents to <code>sqrt(32)</code>.
 * @author Sean A. Irvine
 */
public class A041053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041053() {
    super(new long[] {-1, 0, 0, 0, 34, 0, 0, 0}, new long[] {1, 1, 2, 3, 32, 35, 67, 102});
  }
}
