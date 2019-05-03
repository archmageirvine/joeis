package irvine.oeis.a007;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A007191 McKay-Thompson series of class <code>2B</code> for the Monster group with <code>a(0) = -24</code>.
 * @author Sean A. Irvine
 */
public class A007191 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A007191() {
    super(new PeriodicSequence(-24, 0), 0);
  }
}
