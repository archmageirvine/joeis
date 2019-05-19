package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022583.
 * @author Sean A. Irvine
 */
public class A022583 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022583() {
    super(new PeriodicSequence(18, 0), 0);
  }
}

