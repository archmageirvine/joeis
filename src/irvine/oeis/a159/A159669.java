package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159669 Expansion of x*(1 + x)/(1 - 28*x + x^2).
 * @author Sean A. Irvine
 */
public class A159669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159669() {
    super(new long[] {-1, 28}, new long[] {1, 29});
  }
}
