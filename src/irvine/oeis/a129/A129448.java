package irvine.oeis.a129;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A129448 Expansion of q <code>* psi(-q) * chi(q^3)^2 * psi(-q^9)</code> in powers of q where <code>psi(), chi()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A129448 extends EulerTransform {

  /** Construct the sequence. */
  public A129448() {
    super(new PeriodicSequence(-1, 0, 1, -1, -1, -2, -1, -1, 0, 0, -1, -1, -1, 0, 1, -1, -1, -2, -1, -1, 1, 0, -1, -1, -1, 0, 0, -1, -1, -2, -1, -1, 1, 0, -1, -2), 1);
  }
}
