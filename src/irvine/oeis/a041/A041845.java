package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041845 Denominators of continued fraction convergents to sqrt(444).
 * @author Sean A. Irvine
 */
public class A041845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041845() {
    super(new long[] {-1, 0, 590, 0}, new long[] {1, 14, 589, 8260});
  }
}
