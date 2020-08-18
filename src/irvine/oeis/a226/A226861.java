package irvine.oeis.a226;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A226861 Expansion of <code>phi(x) * f(-x^3)</code> in powers of x where <code>phi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A226861 extends EulerTransform {

  /** Construct the sequence. */
  public A226861() {
    super(new PeriodicSequence(2, -3, 1, -1, 2, -4, 2, -1, 1, -3, 2, -2), 1);
  }
}
