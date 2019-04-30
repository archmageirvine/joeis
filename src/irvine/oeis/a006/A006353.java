package irvine.oeis.a006;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A006353 Expansion of (phi(-q^3) * psi(q))^3 / (phi(-q) * psi(q^3)) in powers of q where <code>phi(), psi()</code> are Ramanujan theta functions.
 * @author Sean A. Irvine
 */
public class A006353 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A006353() {
    super(new PeriodicSequence(5, -2, -2, -2, 5, -4), 0);
  }
}

