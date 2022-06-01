package irvine.oeis.a037;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A037158 Convolution of natural numbers n &gt;= 1 with Fibonacci numbers F(k), for k &gt;= -7, with F(-n)=(-1)^(n+1)*F(n).
 * @author Sean A. Irvine
 */
public class A037158 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A037158() {
    super(0, new long[] {13, -21}, new long[] {1, -3, 2, 1, -1});
  }
}
