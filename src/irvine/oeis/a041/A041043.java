package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041043 Denominators of continued fraction convergents to <code>sqrt(27)</code>.
 * @author Sean A. Irvine
 */
public class A041043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041043() {
    super(new long[] {-1, 0, 52, 0}, new long[] {1, 5, 51, 260});
  }
}
