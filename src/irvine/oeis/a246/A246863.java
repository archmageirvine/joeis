package irvine.oeis.a246;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A246863 Expansion of <code>phi(x) * f(x^1, x^7)</code> in powers of x where <code>phi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A246863 extends EulerTransform {

  /** Construct the sequence. */
  public A246863() {
    super(new PeriodicSequence(3, -4, 2, -1, 2, -3, 3, -2, 3, -3, 2, -1, 2, -4, 3, -2), 1);
  }
}
