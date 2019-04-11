package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096980 Expansion of <code>(1+3x)/(1-2x-7x^2)</code>.
 * @author Sean A. Irvine
 */
public class A096980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096980() {
    super(new long[] {7, 2}, new long[] {1, 5});
  }
}
