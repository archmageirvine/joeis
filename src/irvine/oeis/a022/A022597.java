package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022597.
 * @author Sean A. Irvine
 */
public class A022597 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022597() {
    super(new PeriodicSequence(-2, 0), 0);
  }
}

