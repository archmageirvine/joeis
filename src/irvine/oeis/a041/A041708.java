package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041708 Numerators of continued fraction convergents to <code>sqrt(374)</code>.
 * @author Sean A. Irvine
 */
public class A041708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041708() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 6730, 0, 0, 0, 0, 0}, new long[] {19, 39, 58, 1083, 1141, 3365, 129011, 261387, 390398, 7288551, 7678949, 22646449});
  }
}
