package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127595 a(n) = F(4n) - 2F(2n) where F(n) = Fibonacci numbers A000045.
 * @author Sean A. Irvine
 */
public class A127595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127595() {
    super(new long[] {-1, 10, -23, 10}, new long[] {0, 1, 15, 128});
  }
}
