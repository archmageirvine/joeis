package irvine.oeis.a007;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A007325.
 * @author Sean A. Irvine
 */
public class A007325 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A007325() {
    super(new PeriodicSequence(-1, 1, 1, -1, 0), 0);
  }
}
