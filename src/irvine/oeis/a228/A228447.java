package irvine.oeis.a228;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A228447 Expansion of q * (psi(q^3) * psi(q^6)) / (psi(q) * phi(q)) in powers of q where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A228447 extends EulerTransform {

  /** Construct the sequence. */
  public A228447() {
    super(new PaddingSequence(new long[] {  }, new long[] {-3, 4, -2, 2, -3, 4, -3, 2, -2, 4, -3, 0}), 1);
  }
}
