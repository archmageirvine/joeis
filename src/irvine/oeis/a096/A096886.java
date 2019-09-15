package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096886 Expansion of <code>(1+3x)/(1-8x^2)</code>.
 * @author Sean A. Irvine
 */
public class A096886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096886() {
    super(new long[] {8, 0}, new long[] {1, 3});
  }
}
