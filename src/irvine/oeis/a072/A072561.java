package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072561 Denominators of w(n) equals 3 where w(1)=w(2)=w(3)=1, w(n)=(w(n-1)*w(n-2)+(w(n-1)+w(n-2))/3) / w(n-3).
 * @author Sean A. Irvine
 */
public class A072561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072561() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 3, 4, 6, 7, 9, 10, 12, 13, 15, 19});
  }
}
