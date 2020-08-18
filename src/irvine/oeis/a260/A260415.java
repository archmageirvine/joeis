package irvine.oeis.a260;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A260415 Expansion of <code>f(x, x^2) * f(x^4, x^8)</code> in powers of x where <code>f(,)</code> is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A260415 extends EulerTransform {

  /** Construct the sequence. */
  public A260415() {
    super(new PeriodicSequence(1, 0, -1, 1, 1, -1, 1, 0, -1, 0, 1, -2, 1, 0, -1, 0, 1, -1, 1, 1, -1, 0, 1, -2), 1);
  }
}
