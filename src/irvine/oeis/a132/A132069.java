package irvine.oeis.a132;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A132069 Expansion of <code>eta(q) * eta(q^2)^2 * eta(q^5)^3 / eta(q^10)^2</code> in powers of q.
 * @author Georg Fischer
 */
public class A132069 extends EulerTransform {

  /** Construct the sequence. */
  public A132069() {
    super(new PeriodicSequence(-1, -3, -1, -3, -4, -3, -1, -3, -1, -4), 1);
  }
}
