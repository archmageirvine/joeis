package irvine.oeis.a184;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A184327 a(1)=1, a(2)=17; thereafter a(n) = 6*a(n-1)-a(n-2)+c, where c=-4 if n is odd, c=12 if n is even.
 * @author Sean A. Irvine
 */
public class A184327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184327() {
    super(new long[] {1, -6, 0, 6}, new long[] {1, 17, 97, 577});
  }
}
