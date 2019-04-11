package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217444 <code>a(n) =</code> A(n)*7^(-floor(n+1)/3), where A(n) = 7*A(n-1) - 14*A(n-2) + 7*A(n-3) with A(0)=0, A(1)=1, A(2)=7.
 * @author Sean A. Irvine
 */
public class A217444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217444() {
    super(new long[] {1, 0, 0, -17, 0, 0, 10, 0, 0}, new long[] {0, 1, 1, 5, 22, 13, 52, 204, 113});
  }
}
