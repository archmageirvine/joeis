package irvine.oeis.a215;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A215596 Expansion of <code>psi(-x) * f(-x^4)^3</code> in powers of x where <code>psi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A215596 extends EulerTransform {

  /** Construct the sequence. */
  public A215596() {
    super(new PeriodicSequence(-1, 0, -1, -4), 1);
  }
}
