package irvine.oeis.a000;

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;

/**
 * A000730 Expansion of Product_{n&gt;=1} (1 - x^n)^7.
 * @author Sean A. Irvine
 */
public class A000730 extends EulerTransform {

  /**
   * Construct the sequence.
   */
  public A000730() {
    super(new PeriodicSequence(-7, -7), 1);
  }
}
