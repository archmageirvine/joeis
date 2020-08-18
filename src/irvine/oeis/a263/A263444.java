package irvine.oeis.a263;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A263444 Expansion of <code>psi(q)^2 * chi(-q^6)^2 * f(-q^6)</code> in powers of q where <code>psi(), chi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A263444 extends EulerTransform {

  /** Construct the sequence. */
  public A263444() {
    super(new PeriodicSequence(2, -2, 2, -2, 2, -5, 2, -2, 2, -2, 2, -3), 1);
  }
}
