package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041685 Denominators of continued fraction convergents to <code>sqrt(362)</code>.
 * @author Sean A. Irvine
 */
public class A041685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041685() {
    super(new long[] {1, 38}, new long[] {1, 38});
  }
}
