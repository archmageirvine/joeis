package irvine.oeis.a207;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A207710 Expansion of <code>f(x) * f(-x^10) / f(-x^2, -x^8)</code> in powers of x where <code>f()</code> is Ramanujan's two-variable theta function.
 * @author Georg Fischer
 */
public class A207710 extends EulerTransform {

  /** Construct the sequence. */
  public A207710() {
    super(new PeriodicSequence(1, -1, 1, -1, 1, -2, 1, 0, 1, -2, 1, 0, 1, -2, 1, -1, 1, -1, 1, -1), 1);
  }
}
