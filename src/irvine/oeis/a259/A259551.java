package irvine.oeis.a259;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A259551 Expansion of <code>f(x^2, x^3) * f(-x^4, -x^6) / f(-x^2)</code> in powers of x where <code>f(,)</code> is the Ramanujan general theta function.
 * @author Georg Fischer
 */
public class A259551 extends EulerTransform {

  /** Construct the sequence. */
  public A259551() {
    super(new PeriodicSequence(0, 2, 1, -1, -1, -1, 1, 2, 0, -1), 1);
  }
}
