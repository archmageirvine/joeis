package irvine.oeis.a006;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A006922 Expansion of <code>1/eta(q)^24</code>; Fourier coefficients of <code>T_{14}</code>.
 * @author Sean A. Irvine
 */
public class A006922 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A006922() {
    super(new PeriodicSequence(24), 0);
  }
}
