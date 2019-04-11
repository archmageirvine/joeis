package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041853 Denominators of continued fraction convergents to <code>sqrt(448)</code>.
 * @author Sean A. Irvine
 */
public class A041853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041853() {
    super(new long[] {-1, 0, 254, 0}, new long[] {1, 6, 253, 1524});
  }
}
