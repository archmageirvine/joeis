package irvine.oeis.a140;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A140728 Expansion of <code>(phi(-q^3) * phi(-q^5) - phi(-q) * phi(-q^15)) / 2</code> in powers of q where <code>phi()</code> is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A140728 extends EulerTransform {

  /** Construct the sequence. */
  public A140728() {
    super(new PeriodicSequence(0, -1, -1, -1, -1, -1, 0, -1, -1, -1, 0, -1, 0, -1, -2, -1, 0, -1, 0, -1, -1, -1, 0, -1, -1, -1, -1, -1, 0, -2), 1);
  }
}
