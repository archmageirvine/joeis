package irvine.oeis.a328;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A328802 Expansion of <code>chi(x) * chi(-x^3)</code> in powers of x where <code>chi()</code> is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A328802 extends EulerTransform {

  /** Construct the sequence. */
  public A328802() {
    super(new PeriodicSequence(1, -1, 0, 0, 1, -1, 1, 0, 0, -1, 1, 0), 1);
  }
}
