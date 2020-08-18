package irvine.oeis.a085;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A085140 Expansion of <code>q^(-1/6) * eta(q^2)^3 / eta(q)^2</code> in powers of q.
 * @author Georg Fischer
 */
public class A085140 extends EulerTransform {

  /** Construct the sequence. */
  public A085140() {
    super(new PeriodicSequence(2, -1), 1);
  }
}
