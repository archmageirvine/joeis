package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096881 Expansion of <code>(1+4*x)/(1-17*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A096881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096881() {
    super(new long[] {17, 0}, new long[] {1, 4});
  }
}
