package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291658 <code>a(n)</code> is the sum of all integers from <code>5^n</code> to <code>5^(n+1)-1</code>.
 * @author Sean A. Irvine
 */
public class A291658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291658() {
    super(new long[] {-125, 30}, new long[] {10, 290});
  }
}
