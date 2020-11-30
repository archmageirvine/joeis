package irvine.oeis.a000;

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;

/**
 * A000728 Expansion of Product_{n&gt;=1} (1-x^n)^5.
 * @author Sean A. Irvine
 */
public class A000728 extends EulerTransform {

  /**
   * Construct the sequence.
   */
  public A000728() {
    super(new PeriodicSequence(-5, -5), 1);
  }
}
