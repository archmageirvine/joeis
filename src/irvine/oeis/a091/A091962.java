package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091962.
 * @author Sean A. Irvine
 */
public class A091962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091962() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1, 42, 594, 4719, 26026, 111384, 395352, 1215126, 3331251, 8321170});
  }
}
