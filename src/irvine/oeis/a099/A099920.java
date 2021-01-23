package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099920 a(n) = (n+1)*F(n), F(n) = Fibonacci numbers A000045.
 * @author Sean A. Irvine
 */
public class A099920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099920() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, 2, 3, 8});
  }
}
