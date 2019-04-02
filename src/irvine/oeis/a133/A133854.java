package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133854 a(n)*a(n-13) = a(n-1)*a(n-12)+a(n-6)+a(n-7) with initial terms a(1)=...=a(13)=1.
 * @author Sean A. Irvine
 */
public class A133854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133854() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 5, 7, 9, 11, 13, 17, 25, 37, 53, 73, 97, 321, 549, 781, 1017, 1257, 1501, 1995, 2985, 4471, 6453, 8931});
  }
}
