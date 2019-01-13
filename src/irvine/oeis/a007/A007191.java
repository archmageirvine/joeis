package irvine.oeis.a007;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A007191.
 * @author Sean A. Irvine
 */
public class A007191 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A007191() {
    super(new PeriodicSequence(-24, 0), 0);
  }
}
