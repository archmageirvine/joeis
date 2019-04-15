package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081006 <code>Fibonacci(4n)-1,</code> or <code>Fibonacci(2n+1)*Lucas(2n-1)</code>.
 * @author Sean A. Irvine
 */
public class A081006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081006() {
    super(new long[] {1, -8, 8}, new long[] {2, 20, 143});
  }
}
