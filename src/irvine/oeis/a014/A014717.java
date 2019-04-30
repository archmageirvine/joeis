package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014717 <code>a(n) = (F(n+1)+L(n))^2</code> where <code>F(n)</code> are the Fibonacci numbers (A000045) and <code>L(n)</code> are the Lucas numbers (A000032).
 * @author Sean A. Irvine
 */
public class A014717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014717() {
    super(new long[] {-1, 2, 2}, new long[] {9, 4, 25});
  }
}
