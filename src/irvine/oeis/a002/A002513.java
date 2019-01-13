package irvine.oeis.a002;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.EulerTransformSequence;

/**
 * A002513.
 * @author Sean A. Irvine
 */
public class A002513 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A002513() {
    super(new PeriodicSequence(1, 2), 0);
  }
}
