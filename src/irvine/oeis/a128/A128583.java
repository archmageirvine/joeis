package irvine.oeis.a128;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A128583 Expansion of <code>chi(x) * psi(x^2) * phi(-x^6)</code> in powers of x where <code>phi(), psi(), chi()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A128583 extends EulerTransform {

  /** Construct the sequence. */
  public A128583() {
    super(new PeriodicSequence(1, 0, 1, -1, 1, -2, 1, -1, 1, 0, 1, -2), 1);
  }
}
