package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041616 Numerators of continued fraction convergents to <code>sqrt(327)</code>.
 * @author Sean A. Irvine
 */
public class A041616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041616() {
    super(new long[] {-1, 0, 434, 0}, new long[] {18, 217, 7830, 94177});
  }
}
