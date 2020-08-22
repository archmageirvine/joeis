package irvine.oeis.a278;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A278556 Expansion of Product_{n&gt;=1} (1 - x^(5*n))^18/(1 - x^n)^19 in powers of x.
 * @author Georg Fischer
 */
public class A278556 extends EulerTransform {

  /** Construct the sequence. */
  public A278556() {
    super(new PaddingSequence(new long[] {  }, new long[] {19, 19, 19, 19, 1}), 1);
  }
}
