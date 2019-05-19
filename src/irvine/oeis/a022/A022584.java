package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022584.
 * @author Sean A. Irvine
 */
public class A022584 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022584() {
    super(new PeriodicSequence(19, 0), 0);
  }
}

