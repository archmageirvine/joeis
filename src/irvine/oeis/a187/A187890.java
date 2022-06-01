package irvine.oeis.a187;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A187890 a(1)=0, a(2)=4, a(n)=a(n-1)+a(n-2)-1.
 * @author Sean A. Irvine
 */
public class A187890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187890() {
    super(new long[] {-1, 0, 2}, new long[] {0, 4, 3});
  }
}
