package irvine.oeis.a007;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A007191 McKay-Thompson series of class 2B for the Monster group with a(0) = -24.
 * @author Sean A. Irvine
 */
public class A007191 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A007191() {
    super(new PeriodicSequence(-24, 0), 0);
  }
}
