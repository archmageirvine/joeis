package irvine.oeis.a139;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A139214 Expansion of q * psi(q^2) * psi(-q^9) / (phi(-q^3) * psi(-q^3)) in powers of q where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A139214 extends EulerTransform {

  /** Construct the sequence. */
  public A139214() {
    super(new PaddingSequence(new long[] {  }, new long[] {0, 1, 3, -1, 0, 2, 0, -1, 2, 1, 0, 1, 0, 1, 3, -1, 0, 2, 0, -1, 3, 1, 0, 1, 0, 1, 2, -1, 0, 2, 0, -1, 3, 1, 0, 0}), 1);
  }
}
