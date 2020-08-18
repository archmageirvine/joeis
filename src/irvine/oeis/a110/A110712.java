package irvine.oeis.a110;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A110712 Expansion of <code>eta(q)^3 * eta(q^5) * eta(q^10)^2 / eta(q^2)^2</code> in powers of q.
 * @author Georg Fischer
 */
public class A110712 extends EulerTransform {

  /** Construct the sequence. */
  public A110712() {
    super(new PeriodicSequence(-3, -1, -3, -1, -4, -1, -3, -1, -3, -4), 1);
  }
}
