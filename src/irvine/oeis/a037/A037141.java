package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037141 Convolution of natural numbers n &gt;= 1 with Fibonacci numbers F(k), for k &gt;= -5, with F(-n)=(-1)^(n+1)*F(n);.
 * @author Sean A. Irvine
 */
public class A037141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037141() {
    super(new long[] {1, -1, -2, 3}, new long[] {5, 7, 11, 14});
  }
}
