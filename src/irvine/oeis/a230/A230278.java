package irvine.oeis.a230;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A230278 Expansion of <code>q^(-2/3) * eta(q^2)^10 / eta(q)^4</code> in powers of q.
 * @author Georg Fischer
 */
public class A230278 extends EulerTransform {

  /** Construct the sequence. */
  public A230278() {
    super(new PeriodicSequence(4, -6), 1);
  }
}
