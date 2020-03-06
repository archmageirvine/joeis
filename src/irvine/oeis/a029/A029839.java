package irvine.oeis.a029;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A029839 McKay-Thompson series of class <code>16B</code> for the Monster group.
 * @author Sean A. Irvine
 */
public class A029839 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A029839() {
    super(new PeriodicSequence(2, -4, 2, 0), 0);
  }
}
