package irvine.oeis.a279;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A279261 Expansion of <code>q^(-1/3) * eta(q)^3 * eta(q^3)^3 / eta(q^2)^2</code> in powers of q.
 * @author Georg Fischer
 */
public class A279261 extends EulerTransform {

  /** Construct the sequence. */
  public A279261() {
    super(new PeriodicSequence(-3, -1, -6, -1, -3, -4), 1);
  }
}
