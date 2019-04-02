package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156269 Denominators of a series expansion for Pi/2.
 * @author Sean A. Irvine
 */
public class A156269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156269() {
    super(new long[] {-16, 0, 0, -8, 0, 0}, new long[] {1, 2, 6, -20, -24, -56});
  }
}
