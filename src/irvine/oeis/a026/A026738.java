package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026738 Expansion of <code>1/((1-2*x)*(1-6*x)*(1-8*x)*(1-12*x))</code>.
 * @author Sean A. Irvine
 */
public class A026738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026738() {
    super(new long[] {-1152, 1008, -268, 28}, new long[] {1, 28, 516, 7952});
  }
}
