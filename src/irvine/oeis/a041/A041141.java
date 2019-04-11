package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041141 Denominators of continued fraction convergents to <code>sqrt(79)</code>.
 * @author Sean A. Irvine
 */
public class A041141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041141() {
    super(new long[] {-1, 0, 0, 0, 160, 0, 0, 0}, new long[] {1, 1, 8, 9, 152, 161, 1279, 1440});
  }
}
