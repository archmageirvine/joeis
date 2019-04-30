package irvine.oeis.a002;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.EulerTransformSequence;

/**
 * A002512 Expansion of <code>chi(x)^10 / phi(x)^4</code> in powers of x where <code>phi(), chi()</code> are Ramanujan theta functions.
 * @author Sean A. Irvine
 */
public class A002512 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A002512() {
    super(new PeriodicSequence(2, 2, 2, 4), 0);
  }
}
