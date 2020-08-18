package irvine.oeis.a255;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A255318 Expansion of <code>psi(x^3) * f(x^2, x^4)</code> in powers of x where <code>psi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A255318 extends EulerTransform {

  /** Construct the sequence. */
  public A255318() {
    super(new PeriodicSequence(0, 1, 1, 0, 0, -2, 0, 0, 1, 1, 0, -2), 1);
  }
}
