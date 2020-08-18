package irvine.oeis.a259;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A259358 Expansion of <code>f(-x^5)^2 / f(-x^2, -x^3)</code> in powers of x where <code>f(,)</code> is the Ramanujan general theta function.
 * @author Georg Fischer
 */
public class A259358 extends EulerTransform {

  /** Construct the sequence. */
  public A259358() {
    super(new PeriodicSequence(0, 1, 1, 0, -1), 1);
  }
}
