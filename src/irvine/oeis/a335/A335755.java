package irvine.oeis.a335;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A335755 a(n) is the number of overpartitions of n where overlined parts are not divisible by 3 and non-overlined parts are congruent to 2 modulo 3.
 * @author Georg Fischer
 */
public class A335755 extends EulerTransform {

  /** Construct the sequence. */
  public A335755() {
    super(new PaddingSequence(new long[] {  }, new long[] {1, 1, 0, 0, 2, 0}), 1);
  }
}
