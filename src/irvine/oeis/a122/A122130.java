package irvine.oeis.a122;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A122130 Expansion of <code>f(-x^4, -x^16) / psi(-x)</code> in powers of x where <code>psi()</code> is a Ramanujan theta function and <code>f(, )</code> is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A122130 extends EulerTransform {

  /** Construct the sequence. */
  public A122130() {
    super(new PeriodicSequence(1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0), 1);
  }
}
