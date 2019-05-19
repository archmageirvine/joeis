package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022608.
 * @author Sean A. Irvine
 */
public class A022608 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022608() {
    super(new PeriodicSequence(-13, 0), 0);
  }
}

