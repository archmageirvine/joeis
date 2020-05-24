package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014717 <code>a(n) = (F(n+1) + L(n))^2</code> where <code>F(n)</code> are the Fibonacci numbers <code>(A000045)</code> and <code>L(n)</code> are the Lucas numbers <code>(A000032)</code>.
 * @author Sean A. Irvine
 */
public class A014717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014717() {
    super(new long[] {-1, 2, 2}, new long[] {9, 4, 25});
  }
}
