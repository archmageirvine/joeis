package irvine.oeis.a259;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A259655 Expansion of <code>psi(x^2) * f(-x^3)^3 / f(-x)</code> in powers of x where <code>psi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A259655 extends EulerTransform {

  /** Construct the sequence. */
  public A259655() {
    super(new PeriodicSequence(1, 2, -2, 0, 1, -1, 1, 0, -2, 2, 1, -3), 1);
  }
}
