package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037141 Convolution of natural numbers <code>n &gt;= 1</code> with Fibonacci numbers <code>F(k)</code>, for <code>k &gt;= -5</code>, with <code>F(-n)=(-1)^(n+1)*F(n)</code>;.
 * @author Sean A. Irvine
 */
public class A037141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037141() {
    super(new long[] {1, -1, -2, 3}, new long[] {5, 7, 11, 14});
  }
}
