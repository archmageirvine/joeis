package irvine.oeis.a154;
// Generated by gen_seq4.pl padding 1 at 2020-08-22 18:36

import irvine.oeis.recur.PaddingSequence;

/**
 * A154955 a(1) = 1, a(2) = -1, followed by 0, 0, 0, ... .
 * @author Georg Fischer
 */
public class A154955 extends PaddingSequence {

  /** Construct the sequence. */
  public A154955() {
    super(1, new long[]{1, -1}, new long[]{0});
  }
}
