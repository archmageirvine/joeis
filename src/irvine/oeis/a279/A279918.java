package irvine.oeis.a279;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A279918 Expansion of <code>f(-x^2)^7 / (f(x) * f(-x^8)^2)</code> in powers of x where <code>f()</code> is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A279918 extends EulerTransform {

  /** Construct the sequence. */
  public A279918() {
    super(new PeriodicSequence(-1, -5, -1, -6, -1, -5, -1, -4), 1);
  }
}
