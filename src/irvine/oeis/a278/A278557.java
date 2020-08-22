package irvine.oeis.a278;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A278557 Expansion of Product_{n&gt;=1} (1 - x^(5*n))^24/(1 - x^n)^25 in powers of x.
 * @author Georg Fischer
 */
public class A278557 extends EulerTransform {

  /** Construct the sequence. */
  public A278557() {
    super(new PaddingSequence(new long[] {  }, new long[] {25, 25, 25, 25, 1}), 1);
  }
}
