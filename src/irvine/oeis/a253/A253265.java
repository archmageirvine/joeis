package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253265 The number of tilings of <code>2 X n</code> boards with squares of 2 colors and dominoes of 3 colors.
 * @author Sean A. Irvine
 */
public class A253265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253265() {
    super(new long[] {-27, 12, 10}, new long[] {1, 7, 82});
  }
}
