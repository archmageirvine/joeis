package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041563 Denominators of continued fraction convergents to <code>sqrt(299)</code>.
 * @author Sean A. Irvine
 */
public class A041563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041563() {
    super(new long[] {-1, 0, 0, 0, 830, 0, 0, 0}, new long[] {1, 3, 7, 24, 823, 2493, 5809, 19920});
  }
}
