package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041588 Numerators of continued fraction convergents to sqrt(312).
 * @author Sean A. Irvine
 */
public class A041588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041588() {
    super(new long[] {-1, 0, 0, 0, 106, 0, 0, 0}, new long[] {17, 18, 35, 53, 1837, 1890, 3727, 5617});
  }
}
