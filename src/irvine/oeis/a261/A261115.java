package irvine.oeis.a261;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A261115 Expansion of <code>f(x, x) * f(x^4, x^8)</code> in powers of x where <code>f(,)</code> is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A261115 extends EulerTransform {

  /** Construct the sequence. */
  public A261115() {
    super(new PeriodicSequence(2, -3, 2, 0, 2, -3, 2, -1, 2, -3, 2, -2, 2, -3, 2, -1, 2, -3, 2, 0, 2, -3, 2, -2), 1);
  }
}
