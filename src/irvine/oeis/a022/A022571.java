package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022571.
 * @author Sean A. Irvine
 */
public class A022571 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022571() {
    super(new PeriodicSequence(6, 0), 0);
  }
}

