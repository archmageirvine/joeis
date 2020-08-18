package irvine.oeis.a257;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A257632 Expansion of <code>eta(q^6)^3 * eta(q^10)^3 / (eta(q^2) * eta(q^3)^2 * eta(q^5)^2 * eta(q^30))</code> in powers of q.
 * @author Georg Fischer
 */
public class A257632 extends EulerTransform {

  /** Construct the sequence. */
  public A257632() {
    super(new PeriodicSequence(0, 1, 2, 1, 2, 0, 0, 1, 2, 0, 0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 2, 1, 0, 0, 2, 1, 2, 1, 0, 0), 1);
  }
}
