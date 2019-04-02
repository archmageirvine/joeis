package irvine.oeis.a007;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A007096 Expansion of theta_3 / theta_4.
 * @author Sean A. Irvine
 */
public class A007096 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A007096() {
    super(new PeriodicSequence(4, -2, 4, 0), 0);
  }
}
