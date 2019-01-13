package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213585.
 * @author Sean A. Irvine
 */
public class A213585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213585() {
    super(new long[] {-1, 0, 4, -2, -4, 4}, new long[] {1, 7, 22, 54, 116, 232});
  }
}
