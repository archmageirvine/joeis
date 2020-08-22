package irvine.oeis.a096;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A096911 Number of partitions of n into distinct parts with exactly one even part.
 * @author Georg Fischer
 */
public class A096911 extends EulerTransform {

  /** Construct the sequence. */
  public A096911() {
    super(new PaddingSequence(new long[] {1, 0}, new long[] {1, -1, 1, 0}), 0, 1);
  }
}
