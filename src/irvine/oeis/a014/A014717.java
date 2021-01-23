package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014717 a(n) = (F(n+1) + L(n))^2 where F(n) are the Fibonacci numbers (A000045) and L(n) are the Lucas numbers (A000032).
 * @author Sean A. Irvine
 */
public class A014717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014717() {
    super(new long[] {-1, 2, 2}, new long[] {9, 4, 25});
  }
}
