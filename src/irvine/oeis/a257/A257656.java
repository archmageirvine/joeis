package irvine.oeis.a257;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A257656 Expansion of <code>f(x) * f(x^3) * f(-x^4)^2 * chi(-x^6)^2</code> in powers of x where <code>chi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A257656 extends EulerTransform {

  /** Construct the sequence. */
  public A257656() {
    super(new PeriodicSequence(1, -2, 2, -3, 1, -6, 1, -3, 2, -2, 1, -4), 1);
  }
}
