package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041119 Denominators of continued fraction convergents to <code>sqrt(68)</code>.
 * @author Sean A. Irvine
 */
public class A041119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041119() {
    super(new long[] {-1, 0, 66, 0}, new long[] {1, 4, 65, 264});
  }
}
