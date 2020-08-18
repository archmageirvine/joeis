package irvine.oeis.a262;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A262156 Expansion of <code>f(-x^6)^3 / (f(x)^2 * psi(x))</code> in powers of x where <code>psi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A262156 extends EulerTransform {

  /** Construct the sequence. */
  public A262156() {
    super(new PeriodicSequence(-3, 5, -3, 3, -3, 2, -3, 3, -3, 5, -3, 0), 1);
  }
}
