package irvine.oeis.a259;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A259491 Expansion of <code>(eta(q)^2 * eta(q^2) * eta(q^4)^3 / eta(q^8)^2)^2</code> in powers of q.
 * @author Georg Fischer
 */
public class A259491 extends EulerTransform {

  /** Construct the sequence. */
  public A259491() {
    super(new PeriodicSequence(-4, -6, -4, -12, -4, -6, -4, -8), 1);
  }
}
