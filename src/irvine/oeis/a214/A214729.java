package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214729 Member m=6 of the m-family of sums b(m,n) <code>= Sum_{k=0..n}</code> F(k+m)*F(k), m <code>&gt;= 0, n &gt;= 0</code>, with the Fibonacci numbers F.
 * @author Sean A. Irvine
 */
public class A214729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214729() {
    super(new long[] {1, -3, 0, 3}, new long[] {0, 13, 34, 102});
  }
}
