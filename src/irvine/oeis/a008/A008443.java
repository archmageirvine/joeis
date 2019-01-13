package irvine.oeis.a008;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A008443.
 * @author Sean A. Irvine
 */
public class A008443 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A008443() {
    super(new PeriodicSequence(3, -3), 0);
  }
}

