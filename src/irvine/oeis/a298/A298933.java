package irvine.oeis.a298;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A298933 Expansion of <code>f(x, x^2) * f(x, x^3) * f(x^2, x^4)</code> in powers of x where <code>f(, )</code> is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A298933 extends EulerTransform {

  /** Construct the sequence. */
  public A298933() {
    super(new PeriodicSequence(2, 0, 0, -1, 2, -3, 2, -1, 0, 0, 2, -3), 1);
  }
}
