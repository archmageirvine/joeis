package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180236 a(n) = a(n-2)+a(n-4); a(1)=a(4)=101, a(2)=a(3)=10.
 * @author Sean A. Irvine
 */
public class A180236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180236() {
    super(1, new long[] {1, 0, 1, 0}, new long[] {101, 10, 10, 101});
  }
}
