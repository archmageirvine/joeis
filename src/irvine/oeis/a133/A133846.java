package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133846 a(n)*a(n-7) = a(n-1)a(n-6)+a(n-3)+a(n-4) with initial terms a(1)=...=a(7)=1.
 * @author Sean A. Irvine
 */
public class A133846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133846() {
    super(new long[] {1, 0, 0, 0, 0, 0, -46, 0, 0, 0, 0, 0, 46, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 3, 5, 7, 11, 19, 31, 111, 195, 283, 465, 831});
  }
}
