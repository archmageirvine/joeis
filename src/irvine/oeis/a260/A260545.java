package irvine.oeis.a260;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A260545 Expansion of <code>phi(-x^6)^2 / (chi(x) * phi(-x)^2)</code> in powers of x where <code>phi(), chi()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A260545 extends EulerTransform {

  /** Construct the sequence. */
  public A260545() {
    super(new PeriodicSequence(3, 3, 3, 2, 3, -1, 3, 2, 3, 3, 3, 0), 1);
  }
}
