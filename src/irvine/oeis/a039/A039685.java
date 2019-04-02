package irvine.oeis.a039;

import irvine.oeis.LinearRecurrence;

/**
 * A039685 Numbers n such that n^2 ends in 444.
 * @author Sean A. Irvine
 */
public class A039685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A039685() {
    super(new long[] {-1, 1, 1}, new long[] {38, 462, 538});
  }
}
