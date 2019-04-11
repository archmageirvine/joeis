package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042420 Numerators of continued fraction convergents to <code>sqrt(738)</code>.
 * @author Sean A. Irvine
 */
public class A042420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042420() {
    super(new long[] {-1, 0, 326, 0}, new long[] {27, 163, 8829, 53137});
  }
}
