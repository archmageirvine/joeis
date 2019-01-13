package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025190.
 * @author Sean A. Irvine
 */
public class A025190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025190() {
    super(new long[] {-1320, 1682, -395, 34}, new long[] {1, 34, 761, 14126});
  }
}
