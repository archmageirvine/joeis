package irvine.oeis.a318;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A318027 Expansion of Product_{k&gt;=1} 1/((1 - x^k)*(1 - x^(4*k))).
 * @author Georg Fischer
 */
public class A318027 extends EulerTransform {

  /** Construct the sequence. */
  public A318027() {
    super(new PaddingSequence(new long[] {  }, new long[] {1, 1, 1, 2}), 1);
  }
}
