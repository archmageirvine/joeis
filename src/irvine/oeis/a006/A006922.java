package irvine.oeis.a006;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A006922 Expansion of 1/eta(q)^24; Fourier coefficients of T_{14}.
 * @author Sean A. Irvine
 */
public class A006922 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A006922() {
    super(new PeriodicSequence(24), 0);
  }
}
