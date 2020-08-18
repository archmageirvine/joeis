package irvine.oeis.a229;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A229616 Expansion of <code>(phi(-q)^3 / phi(-q^3))^2</code> in powers of q where <code>phi()</code> is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A229616 extends EulerTransform {

  /** Construct the sequence. */
  public A229616() {
    super(new PeriodicSequence(-12, -6, -8, -6, -12, -4), 1);
  }
}
