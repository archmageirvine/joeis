package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022615.
 * @author Sean A. Irvine
 */
public class A022615 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022615() {
    super(new PeriodicSequence(-20, 0), 0);
  }
}

