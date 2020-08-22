package irvine.oeis.a222;
// Generated by gen_seq4.pl eulerxfm 6 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A222706 Total number of parts of multiplicity 6 in all partitions of n.
 * @author Georg Fischer
 */
public class A222706 extends EulerTransform {

  /** Construct the sequence. */
  public A222706() {
    super(new PaddingSequence(new long[] {0, 1, 1, 1, 1, 2, 2}, new long[] {1}), 1);
  }
}
