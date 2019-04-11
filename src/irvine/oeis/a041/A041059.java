package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041059 Denominators of continued fraction convergents to <code>sqrt(35)</code>.
 * @author Sean A. Irvine
 */
public class A041059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041059() {
    super(new long[] {-1, 0, 12, 0}, new long[] {1, 1, 11, 12});
  }
}
