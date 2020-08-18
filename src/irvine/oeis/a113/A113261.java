package irvine.oeis.a113;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A113261 Expansion of <code>(9*phi(q)*phi(q^3)^5 - phi(q)^5*phi(q^3))/8</code> in powers of q where <code>phi(q)</code> is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A113261 extends EulerTransform {

  /** Construct the sequence. */
  public A113261() {
    super(new PeriodicSequence(1, -6, 6, -5, 1, -12, 1, -5, 6, -6, 1, -6), 1);
  }
}
