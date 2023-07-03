package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010313 Continued fraction for cube root of 85.
 * @author Sean A. Irvine
 */
public class A010313 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010313() {
    super(0, new A010655());
  }
}
