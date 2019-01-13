package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093175.
 * @author Sean A. Irvine
 */
public class A093175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093175() {
    super(new long[] {1, 1, 1, 1}, new long[] {1, 4, 9, 16});
  }
}
