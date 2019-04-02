package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042866 Numerators of continued fraction convergents to sqrt(965).
 * @author Sean A. Irvine
 */
public class A042866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042866() {
    super(new long[] {1, 0, 0, 0, 0, 29884, 0, 0, 0, 0}, new long[] {31, 466, 497, 963, 14942, 927367, 13925447, 14852814, 28778261, 446526729});
  }
}
