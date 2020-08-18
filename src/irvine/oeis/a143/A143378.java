package irvine.oeis.a143;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A143378 Expansion of <code>q^(-1/24) * eta(q^2)^5 / (eta(q) * eta(q^4)^2)</code> in powers of q.
 * @author Georg Fischer
 */
public class A143378 extends EulerTransform {

  /** Construct the sequence. */
  public A143378() {
    super(new PeriodicSequence(1, -4, 1, -2), 1);
  }
}
