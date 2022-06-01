package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228603 a(1) = 9, a(2) = 44, a(n) = 4*(a(n-1) + a(n-2)) (n &gt;=3).
 * @author Sean A. Irvine
 */
public class A228603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228603() {
    super(new long[] {4, 4}, new long[] {9, 44});
  }
}
