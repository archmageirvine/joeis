package irvine.oeis.a113;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A113417 Expansion of <code>phi(x) * phi(-x)^2 * psi(x^4)</code> in powers of x where <code>phi(), psi()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A113417 extends EulerTransform {

  /** Construct the sequence. */
  public A113417() {
    super(new PeriodicSequence(-2, -5, -2, -2, -2, -5, -2, -4), 1);
  }
}
