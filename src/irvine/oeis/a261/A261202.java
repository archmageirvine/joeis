package irvine.oeis.a261;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A261202 Expansion of <code>phi(-x) * phi(-x^9) / f(-x^6)^2</code> in powers of x where <code>phi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A261202 extends EulerTransform {

  /** Construct the sequence. */
  public A261202() {
    super(new PeriodicSequence(-2, -1, -2, -1, -2, 1, -2, -1, -4, -1, -2, 1, -2, -1, -2, -1, -2, 0), 1);
  }
}
