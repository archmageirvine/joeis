package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042269 Denominators of continued fraction convergents to <code>sqrt(660)</code>.
 * @author Sean A. Irvine
 */
public class A042269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042269() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2158, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 13, 29, 42, 2129, 2171, 6471, 28055, 62581, 90636});
  }
}
