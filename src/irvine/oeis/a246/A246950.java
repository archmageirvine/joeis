package irvine.oeis.a246;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A246950 Expansion of <code>phi(-q) * phi(-q^4)</code> in powers of q where <code>phi()</code> is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A246950 extends EulerTransform {

  /** Construct the sequence. */
  public A246950() {
    super(new PeriodicSequence(-2, -1, -2, -3, -2, -1, -2, -2), 1);
  }
}
