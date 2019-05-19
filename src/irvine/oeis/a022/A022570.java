package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022570.
 * @author Sean A. Irvine
 */
public class A022570 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022570() {
    super(new PeriodicSequence(5, 0), 0);
  }
}

