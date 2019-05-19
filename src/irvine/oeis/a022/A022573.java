package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022573.
 * @author Sean A. Irvine
 */
public class A022573 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022573() {
    super(new PeriodicSequence(8, 0), 0);
  }
}

