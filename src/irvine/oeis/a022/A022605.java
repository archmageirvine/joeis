package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022605.
 * @author Sean A. Irvine
 */
public class A022605 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022605() {
    super(new PeriodicSequence(-10, 0), 0);
  }
}

