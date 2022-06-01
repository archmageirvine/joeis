package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180668 a(n) = a(n-1)+a(n-2)+a(n-3)+4*n-8 with a(0)=0, a(1)=0 and a(2)=1.
 * @author Sean A. Irvine
 */
public class A180668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180668() {
    super(new long[] {1, -1, 0, -2, 3}, new long[] {0, 0, 1, 5, 14});
  }
}
