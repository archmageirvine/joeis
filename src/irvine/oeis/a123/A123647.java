package irvine.oeis.a123;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A123647 Expansion of <code>(eta(q^4) * eta(q^12) / (eta(q) * eta(q^3)))^2</code> in powers of q.
 * @author Georg Fischer
 */
public class A123647 extends EulerTransform {

  /** Construct the sequence. */
  public A123647() {
    super(new PeriodicSequence(2, 2, 4, 0, 2, 4, 2, 0, 4, 2, 2, 0), 1);
  }
}
