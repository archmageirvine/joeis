package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022591.
 * @author Sean A. Irvine
 */
public class A022591 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022591() {
    super(new PeriodicSequence(27, 0), 0);
  }
}

