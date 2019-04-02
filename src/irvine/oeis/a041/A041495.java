package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041495 Denominators of continued fraction convergents to sqrt(264).
 * @author Sean A. Irvine
 */
public class A041495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041495() {
    super(new long[] {-1, 0, 130, 0}, new long[] {1, 4, 129, 520});
  }
}
