package irvine.oeis.a029;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A029841 McKay-Thompson series of class <code>8E</code> for the Monster group.
 * @author Sean A. Irvine
 */
public class A029841 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A029841() {
    super(new PeriodicSequence(4, -8, 4, 0), 0);
  }
}
