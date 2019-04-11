package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267809 <code>a(1)=a(2)=1</code>; if <code>n&gt;2</code> then <code>a(n) = a(n-2) + (a(n-1) mod 10)</code>.
 * @author Sean A. Irvine
 */
public class A267809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267809() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 1, 0, -1, 0, 0, 0, -1, 0, 1, 1, 0, -1, 1, 0, -1, -1, 0, 1, -1, 0, 1, 1, 0, -1, 0, 0, 0, -1, 0, 1, 0, 0, 0, 1, 0}, new long[] {1, 1, 2, 3, 5, 8, 13, 11, 14, 15, 19, 24, 23, 27, 30, 27, 37, 34, 41, 35, 46, 41, 47, 48, 55, 53, 58, 61, 59, 70, 59, 79, 68, 87, 75, 92, 77, 99, 86, 105, 91});
  }
}
