package irvine.oeis.a000;

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;

/**
 * A000739 Expansion of Product_{k&gt;=1} (1 - x^k)^16.
 * @author Sean A. Irvine
 */
public class A000739 extends EulerTransform {

  /**
   * Construct the sequence.
   */
  public A000739() {
    super(new PeriodicSequence(-16, -16), 1);
  }
}
