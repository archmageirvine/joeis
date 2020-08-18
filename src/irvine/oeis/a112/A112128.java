package irvine.oeis.a112;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A112128 Expansion of <code>phi(q^4) / phi(q)</code> in powers of q where <code>phi()</code> is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A112128 extends EulerTransform {

  /** Construct the sequence. */
  public A112128() {
    super(new PeriodicSequence(-2, 3, -2, 3, -2, 3, -2, -2, -2, 3, -2, 3, -2, 3, -2, 0), 1);
  }
}
