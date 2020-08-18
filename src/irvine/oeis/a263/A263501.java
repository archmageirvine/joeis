package irvine.oeis.a263;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A263501 Expansion of <code>phi(-x) * f(-x^2)^3 / f(-x^3)</code> in powers of x where <code>phi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A263501 extends EulerTransform {

  /** Construct the sequence. */
  public A263501() {
    super(new PeriodicSequence(-2, -4, -1, -4, -2, -3), 1);
  }
}
