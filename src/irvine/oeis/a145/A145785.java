package irvine.oeis.a145;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A145785 Expansion of q * f(-q^2) * f(-q^30) / (f(q^3) * f(q^5)) in powers of q where f() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A145785 extends EulerTransform {

  /** Construct the sequence. */
  public A145785() {
    super(new PaddingSequence(new long[] {  }, new long[] {0, -1, -1, -1, -1, 1, 0, -1, -1, 1, 0, 0, 0, -1, -2, -1, 0, 1, 0, 0, -1, -1, 0, 0, -1, -1, -1, -1, 0, 2, 0, -1, -1, -1, -1, 0, 0, -1, -1, 0, 0, 1, 0, -1, -2, -1, 0, 0, 0, 1, -1, -1, 0, 1, -1, -1, -1, -1, 0, 0}), 1);
  }
}
