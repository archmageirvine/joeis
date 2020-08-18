package irvine.oeis.a246;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A246862 Expansion of <code>phi(x) * f(x^3, x^5)</code> in powers of x where <code>phi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A246862 extends EulerTransform {

  /** Construct the sequence. */
  public A246862() {
    super(new PeriodicSequence(2, -3, 3, -1, 3, -4, 2, -2, 2, -4, 3, -1, 3, -3, 2, -2), 1);
  }
}
