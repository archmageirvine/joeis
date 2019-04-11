package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042867 Denominators of continued fraction convergents to <code>sqrt(965)</code>.
 * @author Sean A. Irvine
 */
public class A042867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042867() {
    super(new long[] {1, 0, 0, 0, 0, 29884, 0, 0, 0, 0}, new long[] {1, 15, 16, 31, 481, 29853, 448276, 478129, 926405, 14374204});
  }
}
