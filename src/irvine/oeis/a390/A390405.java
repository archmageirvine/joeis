package irvine.oeis.a390;

import irvine.math.cr.Zeta;
import irvine.oeis.EgyptianFractionSequence;

/**
 * A390405 allocated for Michael B. Porter.
 * @author Sean A. Irvine
 */
public class A390405 extends EgyptianFractionSequence {

  /** Construct the sequence. */
  public A390405() {
    super(Zeta.zeta(3));
  }
}
