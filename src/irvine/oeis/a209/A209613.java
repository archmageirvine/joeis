package irvine.oeis.a209;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A209613 Expansion of q <code>* phi(-q^2)^2 * psi(q^3) * psi(-q^3)^2 / psi(q)</code> in powers of q where <code>phi(), psi()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A209613 extends EulerTransform {

  /** Construct the sequence. */
  public A209613() {
    super(new PeriodicSequence(-1, -3, -2, -1, -1, -4, -1, -1, -2, -3, -1, -4), 1);
  }
}
