package irvine.oeis.a285;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A285445 Expansion of Product_{k&gt;=1} (1 + x^k) / (1 - x^(3*k)).
 * @author Georg Fischer
 */
public class A285445 extends EulerTransform {

  /** Construct the sequence. */
  public A285445() {
    super(new PaddingSequence(new long[] {  }, new long[] {1, 0, 2, 0, 1, 1}), 1);
  }
}
