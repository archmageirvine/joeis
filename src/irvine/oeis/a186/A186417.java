package irvine.oeis.a186;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A186417 The number of unlabeled graphs on n nodes with degree of 1 or 2.
 * @author Georg Fischer
 */
public class A186417 extends EulerTransform {

  /** Construct the sequence. */
  public A186417() {
    super(new PaddingSequence(new long[] {0, 1}, new long[] {2}), 1);
  }
}
