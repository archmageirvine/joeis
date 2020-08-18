package irvine.oeis.a121;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A121363 Expansion of <code>q^(-1/4)(eta(q)*eta(q^6)*eta(q^9)/eta(q^3))^2/(eta(q^2)eta(q^18))</code> in powers of q.
 * @author Georg Fischer
 */
public class A121363 extends EulerTransform {

  /** Construct the sequence. */
  public A121363() {
    super(new PeriodicSequence(-2, -1, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, 0, -1, -2, -2), 1);
  }
}
