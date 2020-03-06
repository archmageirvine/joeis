package irvine.oeis.a029;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A029863 Expansion of <code>Product_{k &gt;= 1} 1/(1-x^k)^c(k)</code>, where <code>c(1), c(2), ... = 2 3 2 3 2 3 2 3</code> ....
 * @author Sean A. Irvine
 */
public class A029863 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A029863() {
    super(new PeriodicSequence(2, 3), 0);
  }
}
