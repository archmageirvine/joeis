package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189442 a(n) = A140230(n) / A016116(n-1).
 * @author Sean A. Irvine
 */
public class A189442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189442() {
    super(new long[] {-1, 0, 0, 0, -2, 0, 0, 0}, new long[] {1, 3, 1, -3, -5, -7, -1, 7});
  }
}
