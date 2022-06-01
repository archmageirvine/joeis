package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259319 a(n) = 2*A002309(n).
 * @author Sean A. Irvine
 */
public class A259319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259319() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {2, 164, 1414, 6216, 19338, 48620});
  }
}
