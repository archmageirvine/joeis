package irvine.oeis.a281;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A281492 Expansion of <code>f(x, x^3) * f(x^4, x^5)</code> in powers of x where <code>f(, )</code> is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A281492 extends EulerTransform {

  /** Construct the sequence. */
  public A281492() {
    super(new PeriodicSequence(1, -1, 1, 0, 2, -1, 1, -2, 0, -2, 1, -1, 2, 0, 1, -1, 1, -2), 1);
  }
}
