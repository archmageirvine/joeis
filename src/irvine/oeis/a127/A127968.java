package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127968 a(n) = F(n+1) + (1-(-1)^n)/2, where F() = Fibonacci numbers A000045.
 * @author Sean A. Irvine
 */
public class A127968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127968() {
    super(new long[] {-1, -1, 2, 1}, new long[] {1, 2, 2, 4});
  }
}
