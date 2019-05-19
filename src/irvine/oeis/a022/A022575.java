package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022575.
 * @author Sean A. Irvine
 */
public class A022575 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022575() {
    super(new PeriodicSequence(10, 0), 0);
  }
}

