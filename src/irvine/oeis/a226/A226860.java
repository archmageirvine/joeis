package irvine.oeis.a226;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A226860 Expansion of <code>psi(-x) * phi(-x^6)</code> in powers of x where <code>phi(), psi()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A226860 extends EulerTransform {

  /** Construct the sequence. */
  public A226860() {
    super(new PeriodicSequence(-1, 0, -1, -1, -1, -2, -1, -1, -1, 0, -1, -2), 1);
  }
}
