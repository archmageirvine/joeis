package irvine.oeis.a000;

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;

/**
 * A000729 Expansion of Product_{k &gt;= 1} (1 - x^k)^6.
 * @author Sean A. Irvine
 */
public class A000729 extends EulerTransform {

  /**
   * Construct the sequence.
   */
  public A000729() {
    super(new PeriodicSequence(-6, -6), 1);
  }
}
