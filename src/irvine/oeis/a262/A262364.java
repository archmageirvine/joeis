package irvine.oeis.a262;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A262364 Expansion of Product_{k&gt;=1} (1-x^(5*k))/(1-x^(2*k)).
 * @author Georg Fischer
 */
public class A262364 extends EulerTransform {

  /** Construct the sequence. */
  public A262364() {
    super(new PaddingSequence(new long[] {  }, new long[] {0, 1, 0, 1, -1, 1, 0, 1, 0, 0}), 1);
  }
}
