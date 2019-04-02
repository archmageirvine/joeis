package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192232 Constant term of the reduction of n-th Fibonacci polynomial by x^2 -&gt; x+1. (See Comments.).
 * @author Sean A. Irvine
 */
public class A192232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192232() {
    super(new long[] {-1, -1, 3, 1}, new long[] {1, 0, 2, 1});
  }
}
