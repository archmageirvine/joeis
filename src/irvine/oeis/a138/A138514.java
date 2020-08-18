package irvine.oeis.a138;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A138514 Expansion of <code>q^(-1/8) * eta(q^2)^4 / (eta(q) * eta(q^4))</code> in powers of q.
 * @author Georg Fischer
 */
public class A138514 extends EulerTransform {

  /** Construct the sequence. */
  public A138514() {
    super(new PeriodicSequence(1, -3, 1, -2), 1);
  }
}
