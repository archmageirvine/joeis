package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085688 a(1) = 11; a(n) = if n == 2 mod 3 then a(n-1)-3, if n == 0 mod 3 then a(n-1)-2, if n == 1 mod 3 then a(n-1)*2.
 * @author Sean A. Irvine
 */
public class A085688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085688() {
    super(1, new long[] {-2, 0, 0, 3, 0, 0}, new long[] {11, 8, 6, 12, 9, 7});
  }
}
