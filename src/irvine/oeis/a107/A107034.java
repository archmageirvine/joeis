package irvine.oeis.a107;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A107034 Expansion of <code>f(-x) * f(-x^4)</code> in powers of x where <code>f()</code> is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A107034 extends EulerTransform {

  /** Construct the sequence. */
  public A107034() {
    super(new PeriodicSequence(-1, -1, -1, -2), 1);
  }
}
