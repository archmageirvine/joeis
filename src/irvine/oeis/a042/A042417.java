package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042417 Denominators of continued fraction convergents to <code>sqrt(736)</code>.
 * @author Sean A. Irvine
 */
public class A042417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042417() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 48670, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 7, 8, 23, 31, 85, 116, 897, 48554, 340775, 389329, 1119433, 1508762, 4136957, 5645719, 43656990});
  }
}
