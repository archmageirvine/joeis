package irvine.oeis.a219;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A219607 Number of partitions of n into distinct parts 5*k+2 or 5*k+3.
 * @author Georg Fischer
 */
public class A219607 extends EulerTransform {

  /** Construct the sequence. */
  public A219607() {
    super(new PaddingSequence(new long[] {  }, new long[] {0, 1, 1, -1, 0, -1, 1, 1, 0, 0}), 1);
  }
}
