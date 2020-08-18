package irvine.oeis.a260;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A260145 Expansion of <code>x * (psi(x^4) / phi(x))^2</code> in powers of x where <code>phi(), psi()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A260145 extends EulerTransform {

  /** Construct the sequence. */
  public A260145() {
    super(new PeriodicSequence(-4, 6, -4, 4, -4, 6, -4, 0), 1);
  }
}
