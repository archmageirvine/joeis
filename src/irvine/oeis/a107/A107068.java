package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107068 Expansion of 1/((1+x)^3-x^4).
 * @author Sean A. Irvine
 */
public class A107068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107068() {
    super(new long[] {1, -1, -3, -3}, new long[] {1, -3, 6, -10});
  }
}
