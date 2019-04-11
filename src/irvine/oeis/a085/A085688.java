package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085688 <code>a(1) = 11</code>; <code>a(n) =</code> if <code>n == 2 mod 3</code> then <code>a(n-1)-3,</code> if <code>n == 0 mod 3</code> then <code>a(n-1)-2,</code> if <code>n == 1 mod 3</code> then <code>a(n-1)*2</code>.
 * @author Sean A. Irvine
 */
public class A085688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085688() {
    super(new long[] {-2, 0, 0, 3, 0, 0}, new long[] {11, 8, 6, 12, 9, 7});
  }
}
