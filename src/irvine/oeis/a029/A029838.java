package irvine.oeis.a029;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A029838 Expansion of square root of q times normalized Hauptmodul for <code>Gamma(4)</code> in powers of <code>q^8</code>.
 * @author Sean A. Irvine
 */
public class A029838 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A029838() {
    super(new PeriodicSequence(1, -2, 1, 0), 0);
  }
}
