package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041622 Numerators of continued fraction convergents to <code>sqrt(330)</code>.
 * @author Sean A. Irvine
 */
public class A041622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041622() {
    super(new long[] {-1, 0, 218, 0}, new long[] {18, 109, 3942, 23761});
  }
}
