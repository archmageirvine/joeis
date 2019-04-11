package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181635 Expansion of <code>36*x^2*(1+36*x^2-6*x) / ((36*x^2+6*x+1)*(1-6*x)^2)</code>.
 * @author Sean A. Irvine
 */
public class A181635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181635() {
    super(new long[] {-1296, 216, 0, 6}, new long[] {0, 36, 0, 1296});
  }
}
