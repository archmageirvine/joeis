package irvine.oeis.a007;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A007325 G.f.: Product_{k&gt;0} <code>(1-x^(5k-1))*(1-x^(5k-4))/((1-x^(5k-2))*(1-x^(5k-3)))</code>.
 * @author Sean A. Irvine
 */
public class A007325 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A007325() {
    super(new PeriodicSequence(-1, 1, 1, -1, 0), 0);
  }
}
