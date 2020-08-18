package irvine.oeis.a122;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A122854 Expansion of <code>phi(q)^2*psi(q)^4</code> in powers of q where <code>phi(),psi()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A122854 extends EulerTransform {

  /** Construct the sequence. */
  public A122854() {
    super(new PeriodicSequence(8, -10, 8, -6), 1);
  }
}
