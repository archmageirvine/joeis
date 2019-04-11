package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041324 Numerators of continued fraction convergents to <code>sqrt(176)</code>.
 * @author Sean A. Irvine
 */
public class A041324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041324() {
    super(new long[] {-1, 0, 0, 0, 398, 0, 0, 0}, new long[] {13, 40, 53, 199, 5227, 15880, 21107, 79201});
  }
}
