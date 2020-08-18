package irvine.oeis.a096;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A096726 Expansion of <code>eta(q^3)^10 / (eta(q) * eta(q^9))^3</code> in powers of q.
 * @author Georg Fischer
 */
public class A096726 extends EulerTransform {

  /** Construct the sequence. */
  public A096726() {
    super(new PeriodicSequence(3, 3, -7, 3, 3, -7, 3, 3, -4), 1);
  }
}
