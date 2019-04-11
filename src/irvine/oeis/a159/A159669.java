package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159669 Expansion of <code>x*(x + 1)/(x^2 - 28*x + 1)</code>.
 * @author Sean A. Irvine
 */
public class A159669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159669() {
    super(new long[] {-1, 28}, new long[] {1, 29});
  }
}
