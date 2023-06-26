package irvine.oeis.a319;

import irvine.oeis.FiniteSequence;

/**
 * A319017 Prime numbers which satisfy the regex m1{1,m1}m2{1,m2}m3{1,m3}m4{1,m4}m5{1,m5} where mi are one-digit Lucas numbers.
 * @author Georg Fischer
 */
public class A319017 extends FiniteSequence {

  /** Construct the sequence. */
  public A319017() {
    super(1, FINITE, 21347, 2213347, 2213447, 21334447, 21344447, 21344777, 22133477, 213334477, 221344477, 2134444777, 22133344447L, 221344477777L, 2133344447777L, 2133347777777L, 2213447777777L, 22133344447777L, 213344447777777L, 221333447777777L, 22133344447777777L);
  }
}
