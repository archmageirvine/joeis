package irvine.oeis.a261;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A261251 Expansion of <code>f(-x, -x) * f(-x^3, -x^15) / f(-x^6, -x^12)^2</code> in powers of x where <code>f(,)</code> is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A261251 extends EulerTransform {

  /** Construct the sequence. */
  public A261251() {
    super(new PeriodicSequence(-2, -1, -3, -1, -2, 1, -2, -1, -2, -1, -2, 1, -2, -1, -3, -1, -2, 0), 1);
  }
}
