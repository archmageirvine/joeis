package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289422.
 * @author Sean A. Irvine
 */
public class A289422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289422() {
    super(new long[] {5, -95, 496, -1163, 1461, -1068, 468, -121, 17}, new long[] {1, 17, 168, 1267, 8099, 46305, 244412, 1215448, 5773812});
  }
}
