package irvine.oeis.a122;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A122135 Expansion of <code>f(x, -x^4) / phi(-x^2)</code> in powers of x where <code>f(, )</code> and <code>phi()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A122135 extends EulerTransform {

  /** Construct the sequence. */
  public A122135() {
    super(new PeriodicSequence(1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0), 1);
  }
}
