package irvine.oeis.a132;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A132217 Expansion of <code>psi(x^6) / psi(-x)</code> in powers of x where <code>psi()</code> is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A132217 extends EulerTransform {

  /** Construct the sequence. */
  public A132217() {
    super(new PeriodicSequence(1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0), 1);
  }
}
