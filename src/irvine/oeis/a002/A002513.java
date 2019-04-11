package irvine.oeis.a002;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.EulerTransformSequence;

/**
 * A002513 Expansion of Product_{k&gt;0} <code>1/((1-x^(2k))^2*(1-x^(2k-1)))</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A002513 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A002513() {
    super(new PeriodicSequence(1, 2), 0);
  }
}
