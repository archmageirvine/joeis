package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022574.
 * @author Sean A. Irvine
 */
public class A022574 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022574() {
    super(new PeriodicSequence(9, 0), 0);
  }
}

