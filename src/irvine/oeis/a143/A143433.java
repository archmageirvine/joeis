package irvine.oeis.a143;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A143433 Expansion of <code>f(-x, x^3)</code> in powers of x where <code>f(,)</code> is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A143433 extends EulerTransform {

  /** Construct the sequence. */
  public A143433() {
    super(new PeriodicSequence(-1, 0, 1, 1, 1, -1, -1, -2, -1, -1, 1, 1, 1, 0, -1, -1), 1);
  }
}
