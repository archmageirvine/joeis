package irvine.oeis.a320;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A320070 Expansion of 1/(theta_3(q) * theta_3(q^2) * theta_3(q^3)), where theta_3() is the Jacobi theta function.
 * @author Georg Fischer
 */
public class A320070 extends EulerTransform {

  /** Construct the sequence. */
  public A320070() {
    super(new PaddingSequence(new long[] {  }, new long[] {-2, 1, -4, 4, -2, 4, -2, 2, -4, 1, -2, 5, -2, 1, -4, 2, -2, 4, -2, 4, -4, 1, -2, 3}), 1);
  }
}
