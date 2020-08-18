package irvine.oeis.a127;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A127693 Expansion of <code>psi(x^2) + x * psi(x^10)</code> in powers of x where <code>psi()</code> is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A127693 extends EulerTransform {

  /** Construct the sequence. */
  public A127693() {
    super(new PeriodicSequence(1, 0, -1, 0, 0, 1, -1, 0, 1, -1, 1, 0, -1, 1, 0, 0, -1, 0, 1, -1), 1);
  }
}
