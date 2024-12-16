package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083335 a(n) = 12*a(n-2) - 25*a(n-4) with initial terms 1,1,7,12.
 * @author Sean A. Irvine
 */
public class A083335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083335() {
    super(new long[] {-25, 0, 12, 0}, new long[] {1, 1, 7, 12});
  }
}
