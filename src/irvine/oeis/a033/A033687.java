package irvine.oeis.a033;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A033687.
 * @author Sean A. Irvine
 */
public class A033687 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A033687() {
    super(new PeriodicSequence(1, 1, -2), 0);
  }
}

