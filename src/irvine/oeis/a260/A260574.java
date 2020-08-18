package irvine.oeis.a260;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A260574 Expansion of <code>phi(x^3) * psi(x^3) / f(x)</code> in powers of x where <code>phi(), psi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A260574 extends EulerTransform {

  /** Construct the sequence. */
  public A260574() {
    super(new PeriodicSequence(-1, 2, 2, 1, -1, -2, -1, 1, 2, 2, -1, -1), 1);
  }
}
