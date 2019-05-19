package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022596.
 * @author Sean A. Irvine
 */
public class A022596 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022596() {
    super(new PeriodicSequence(32, 0), 0);
  }
}

