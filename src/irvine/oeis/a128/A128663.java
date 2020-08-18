package irvine.oeis.a128;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A128663 Expansion of <code>eta(q^3) * eta(q^33) / ( eta(q)* eta(q^11))</code> in powers of q.
 * @author Georg Fischer
 */
public class A128663 extends EulerTransform {

  /** Construct the sequence. */
  public A128663() {
    super(new PeriodicSequence(1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 2, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 2, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0), 1);
  }
}
