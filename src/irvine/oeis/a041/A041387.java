package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041387 Denominators of continued fraction convergents to <code>sqrt(208)</code>.
 * @author Sean A. Irvine
 */
public class A041387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041387() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1298, 0, 0, 0, 0, 0}, new long[] {1, 2, 5, 7, 19, 45, 1279, 2603, 6485, 9088, 24661, 58410});
  }
}
