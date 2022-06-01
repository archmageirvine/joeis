package irvine.oeis.a328;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A328788 Expansion of psi(x^6)^5/psi(-x^3) * (f(-x)/f(-x^4))^3 in powers of x where psi(), f() are Ramanujan theta functions.
 * @author Sean A. Irvine
 */
public class A328788 extends PrependSequence {

  /** Construct the sequence. */
  public A328788() {
    super(new EulerTransformSequence(new PeriodicSequence(-3, -3, -2, 0, -3, 2, -3, 0, -2, -3, -3, -4), 0), 0, 0, 0);
  }
}
