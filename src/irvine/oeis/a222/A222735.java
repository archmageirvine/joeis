package irvine.oeis.a222;
// Generated by gen_seq4.pl eulerxfm 7 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A222735 Total sum of parts of multiplicity 7 in all partitions of n.
 * @author Georg Fischer
 */
public class A222735 extends EulerTransform {

  /** Construct the sequence. */
  public A222735() {
    super(new PaddingSequence(new long[] {0, 1, 1, 1, 1, 1, 3, 3, 1, 1, 1, 1, 1, 1, 0}, new long[] {1}), 1);
  }
}
