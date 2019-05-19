package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022610.
 * @author Sean A. Irvine
 */
public class A022610 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022610() {
    super(new PeriodicSequence(-15, 0), 0);
  }
}

