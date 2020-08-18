package irvine.oeis.a230;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A230322 Expansion of <code>f(-x^3, -x^4) / f(-x^2,-x^5)</code> in powers of x where <code>f(,)</code> is Ramanujan's two-variable theta function.
 * @author Georg Fischer
 */
public class A230322 extends EulerTransform {

  /** Construct the sequence. */
  public A230322() {
    super(new PeriodicSequence(0, 1, -1, -1, 1, 0, 0), 1);
  }
}
