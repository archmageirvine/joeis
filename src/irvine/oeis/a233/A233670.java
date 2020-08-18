package irvine.oeis.a233;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A233670 Expansion of q <code>* phi(-q^2) * psi(q^9) / (f(q^3) * phi(q^3))</code> in powers of q where <code>f(), phi(), psi()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A233670 extends EulerTransform {

  /** Construct the sequence. */
  public A233670() {
    super(new PeriodicSequence(0, -2, -3, -1, 0, 3, 0, -1, -2, -2, 0, 1, 0, -2, -3, -1, 0, 2, 0, -1, -3, -2, 0, 1, 0, -2, -2, -1, 0, 3, 0, -1, -3, -2, 0, 0), 1);
  }
}
