package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022572.
 * @author Sean A. Irvine
 */
public class A022572 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022572() {
    super(new PeriodicSequence(7, 0), 0);
  }
}

