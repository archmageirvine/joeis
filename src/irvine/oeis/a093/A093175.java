package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093175 Tetranacci numbers starting with first four squares.
 * @author Sean A. Irvine
 */
public class A093175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093175() {
    super(new long[] {1, 1, 1, 1}, new long[] {1, 4, 9, 16});
  }
}
