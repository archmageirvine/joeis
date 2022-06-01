package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292616 a(n) = 3*a(n-2) - a(n-4) for n &gt; 3, with a(0)=4, a(1)=3, a(2)=a(3)=6, a sequence related to bisections of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A292616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292616() {
    super(new long[] {-1, 0, 3, 0}, new long[] {4, 3, 6, 6});
  }
}
