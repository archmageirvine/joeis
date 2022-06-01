package irvine.oeis.a236;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A236172 a(n) = ( a(n-2)*(3*a(n-3) + a(n-2)) + a(n-1)*(a(n-1) + 2*a(n-2) + a(n-3)) ) / ( 2*a(n-3) - a(n-2) - 3*a(n-1) ), with a(0)=-3, a(1)=1, a(2)=-2, a(3)=2.
 * @author Sean A. Irvine
 */
public class A236172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236172() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {-3, 1, -2, 2, 2, 0, 8, -4, 4, -8, 0, -2, -2, 2, -1});
  }
}
