package irvine.oeis.a298;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A298421 Expansion of <code>f(q, q^2) * chi(q^3)^3 * f(-q^4)^2</code> in powers of q where <code>chi(), f(), f(,)</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A298421 extends EulerTransform {

  /** Construct the sequence. */
  public A298421() {
    super(new PeriodicSequence(1, 0, 2, -2, 1, -4, 1, -2, 2, 0, 1, -3), 1);
  }
}
