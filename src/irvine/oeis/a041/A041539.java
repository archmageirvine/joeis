package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041539 Denominators of continued fraction convergents to sqrt(286).
 * @author Sean A. Irvine
 */
public class A041539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041539() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1123670, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 11, 34, 113, 260, 893, 2939, 30283, 33222, 1093387, 1126609, 12359477, 38205040, 126974597, 292154234, 1003437299, 3302466131L, 34028098609L, 37330564740L});
  }
}
