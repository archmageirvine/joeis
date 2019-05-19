package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022598.
 * @author Sean A. Irvine
 */
public class A022598 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022598() {
    super(new PeriodicSequence(-3, 0), 0);
  }
}

