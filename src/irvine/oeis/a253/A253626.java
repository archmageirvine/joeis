package irvine.oeis.a253;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A253626 Expansion of <code>psi(q^2) * f(q, q^2)^2 / f(q, q^5)</code> in powers of q where <code>psi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A253626 extends EulerTransform {

  /** Construct the sequence. */
  public A253626() {
    super(new PeriodicSequence(1, 2, -2, -1, 1, 0, 1, -1, -2, 2, 1, -2), 1);
  }
}
