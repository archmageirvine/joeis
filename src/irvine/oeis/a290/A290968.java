package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290968 <code>a(n) = a(n-1) + a(n-2) - a(n-3) + a(n-4) + a(n-5)</code>, with <code>a(0)=a(1)=a(2)=1, a(3)=-1</code> and <code>a(4)=1, a</code> linear recurrence related to Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A290968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290968() {
    super(new long[] {1, 1, -1, 1, 1}, new long[] {1, 1, 1, -1, 1});
  }
}
