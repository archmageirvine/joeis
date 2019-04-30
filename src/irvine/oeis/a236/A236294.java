package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236294 <code>a(n) = max( a(n-1) + a(n-3), 2*a(n-2) ) - a(n-4)</code>, with <code>a(0)=a(1)=1, a(1)=1, a(2)=2, a(3)=3</code>.
 * @author Sean A. Irvine
 */
public class A236294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236294() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, -1, 2}, new long[] {1, 1, 2, 3, 3, 5, 6, 7, 9, 10});
  }
}
