package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041015 Denominators of continued fraction convergents to <code>sqrt(11)</code>.
 * @author Sean A. Irvine
 */
public class A041015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041015() {
    super(new long[] {-1, 0, 20, 0}, new long[] {1, 3, 19, 60});
  }
}
