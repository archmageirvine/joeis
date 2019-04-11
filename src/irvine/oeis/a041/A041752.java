package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041752 Numerators of continued fraction convergents to <code>sqrt(396)</code>.
 * @author Sean A. Irvine
 */
public class A041752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041752() {
    super(new long[] {-1, 0, 0, 0, 398, 0, 0, 0}, new long[] {19, 20, 179, 199, 7741, 7940, 71261, 79201});
  }
}
