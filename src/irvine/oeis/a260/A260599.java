package irvine.oeis.a260;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A260599 Expansion of <code>psi(x^4) / chi(-x)^2</code> in powers of x where <code>psi(), chi()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A260599 extends EulerTransform {

  /** Construct the sequence. */
  public A260599() {
    super(new PeriodicSequence(2, 0, 2, 1, 2, 0, 2, -1), 1);
  }
}
