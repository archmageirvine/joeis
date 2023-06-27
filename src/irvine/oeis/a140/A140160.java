package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140160 a(1)=1, a(n) = a(n-1) + n^4 if n odd, a(n) = a(n-1) + n^3 if n is even.
 * @author Sean A. Irvine
 */
public class A140160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140160() {
    super(1, new long[] {-1, 1, 5, -5, -10, 10, 10, -10, -5, 5, 1}, new long[] {1, 9, 90, 154, 779, 995, 3396, 3908, 10469, 11469, 26110});
  }
}
