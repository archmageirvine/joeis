package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072881 a(1)=a(2)=a(3)=1; for n&gt;3, a(n)=(a(n-1)*a(n-2)+a(n-1)+a(n-2))/a(n-3).
 * @author Sean A. Irvine
 */
public class A072881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072881() {
    super(new long[] {1, 0, -14, 0, 14, 0}, new long[] {1, 1, 1, 3, 7, 31});
  }
}
