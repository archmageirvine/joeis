package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100886 Expansion of <code>x*(1+3*x+2*x^2)/((1+x+x^2)*(1-x-x^2))</code>.
 * @author Sean A. Irvine
 */
public class A100886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100886() {
    super(new long[] {1, 2, 1, 0}, new long[] {0, 1, 3, 3});
  }
}
