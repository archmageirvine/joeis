package irvine.oeis.a271;
// Generated by gen_seq4.pl joinlr 0 0 new long[] {1L, -2L, 0L, 2L} new long[] {36L, 68L, 108L, 150L} new long[] {0L, 10L} at 2019-07-26 00:04

import irvine.oeis.Conjectural;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A271912 Number of ways to choose three distinct points from a 3 X n grid so that they form an isosceles triangle.
 * @author Georg Fischer
 */
public class A271912 extends LinearRecurrence implements Conjectural {

  /** Construct the sequence. */
  public A271912() {
    super(1, new long[] {1L, -2L, 0L, 2L}, new long[] {36L, 68L, 108L, 150L}, 0L, 10L);
  }
}
