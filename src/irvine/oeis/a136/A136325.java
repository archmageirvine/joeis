package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136325 Integers x such that 3(5x^2+3) is a perfect square.
 * @author Sean A. Irvine
 */
public class A136325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136325() {
    super(new long[] {-1, 8}, new long[] {0, 3});
  }
}
