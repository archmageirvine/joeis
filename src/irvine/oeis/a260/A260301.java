package irvine.oeis.a260;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A260301 Expansion of <code>f(-x^3)^3 * psi(x)^3 / psi(x^3)^2</code> in powers of x where <code>phi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A260301 extends EulerTransform {

  /** Construct the sequence. */
  public A260301() {
    super(new PeriodicSequence(3, -3, -2, -3, 3, -4), 1);
  }
}
