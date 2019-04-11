package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042233 Denominators of continued fraction convergents to <code>sqrt(642)</code>.
 * @author Sean A. Irvine
 */
public class A042233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042233() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 11554, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 74, 77, 228, 11477, 23182, 34659, 854998, 889657, 2634312});
  }
}
