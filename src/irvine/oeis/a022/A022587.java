package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022587.
 * @author Sean A. Irvine
 */
public class A022587 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022587() {
    super(new PeriodicSequence(22, 0), 0);
  }
}

