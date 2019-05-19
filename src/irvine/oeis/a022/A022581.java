package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022581.
 * @author Sean A. Irvine
 */
public class A022581 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022581() {
    super(new PeriodicSequence(16, 0), 0);
  }
}

