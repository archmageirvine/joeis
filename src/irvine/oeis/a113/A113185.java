package irvine.oeis.a113;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A113185 Expansion of <code>(5*phi(q)*phi^3(q^5) - phi^3(q)*phi(q^5))/4</code> in powers of q where <code>phi(q)</code> is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A113185 extends EulerTransform {

  /** Construct the sequence. */
  public A113185() {
    super(new PeriodicSequence(1, -4, 1, -3, 4, -4, 1, -3, 1, -8, 1, -3, 1, -4, 4, -3, 1, -4, 1, -4), 1);
  }
}
