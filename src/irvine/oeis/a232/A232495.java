package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232495.
 * @author Sean A. Irvine
 */
public class A232495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232495() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 47, 148, 336});
  }
}
