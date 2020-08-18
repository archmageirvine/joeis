package irvine.oeis.a129;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A129447 Expansion of <code>psi(q) * psi(q^3) * phi(q^3) / phi(q)</code> in powers of q where <code>psi(), phi()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A129447 extends EulerTransform {

  /** Construct the sequence. */
  public A129447() {
    super(new PeriodicSequence(-1, 2, 2, 0, -1, -2, -1, 0, 2, 2, -1, -2), 1);
  }
}
