package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089068 a(n) = a(n-1)+a(n-2)+a(n-3)+2 with a(0)=0, a(1)=0 and a(2)=1.
 * @author Sean A. Irvine
 */
public class A089068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089068() {
    super(new long[] {-1, 0, 0, 2}, new long[] {0, 0, 1, 3});
  }
}
