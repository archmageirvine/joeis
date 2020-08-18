package irvine.oeis.a164;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A164617 Expansion of <code>(phi^3(q^3) / phi(q)) * (psi(-q^3) / psi^3(-q))</code> in powers of q where <code>phi(), psi()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A164617 extends EulerTransform {

  /** Construct the sequence. */
  public A164617() {
    super(new PeriodicSequence(1, 3, 6, 4, 1, -6, 1, 4, 6, 3, 1, 0), 1);
  }
}
