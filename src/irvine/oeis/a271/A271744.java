package irvine.oeis.a271;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {-24L, 50L, -35L, 10L} new long[] {59L, 139L, 365L, 1039L} new long[] {30L} at 2019-07-26 00:04

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271744 Number of set partitions of [n] such that 5 is the largest element of the last block.
 * @author Georg Fischer
 */
public class A271744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271744() {
    super(5, new long[] {-24L, 50L, -35L, 10L}, new long[] {59L, 139L, 365L, 1039L}, 30L);
  }
}
