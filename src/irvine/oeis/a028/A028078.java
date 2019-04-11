package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028078 Expansion of <code>1/((1-3*x)*(1-6*x)*(1-7*x)*(1-12*x))</code>.
 * @author Sean A. Irvine
 */
public class A028078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028078() {
    super(new long[] {-1512, 1098, -273, 28}, new long[] {1, 28, 511, 7762});
  }
}
