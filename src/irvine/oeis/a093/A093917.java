package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093917.
 * @author Sean A. Irvine
 */
public class A093917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093917() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {2, 15, 30, 102, 130, 333, 350, 780});
  }
}
