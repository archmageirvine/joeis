package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041897 Denominators of continued fraction convergents to <code>sqrt(470)</code>.
 * @author Sean A. Irvine
 */
public class A041897 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041897() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 3382, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 25, 53, 78, 3329, 3407, 10143, 84551, 179245, 263796});
  }
}
