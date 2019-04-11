package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041173 Denominators of continued fraction convergents to <code>sqrt(96)</code>.
 * @author Sean A. Irvine
 */
public class A041173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041173() {
    super(new long[] {-1, 0, 0, 0, 98, 0, 0, 0}, new long[] {1, 1, 4, 5, 94, 99, 391, 490});
  }
}
