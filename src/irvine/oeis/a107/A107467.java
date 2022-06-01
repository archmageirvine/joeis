package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107467 a(n)= 3*a(n-1) +a(n-2) -3*a(n-3) +a(n-4)+ 2*a(n-5) -a(n-6) -a(n-7).
 * @author Sean A. Irvine
 */
public class A107467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107467() {
    super(new long[] {-1, -1, 2, 1, -3, 1, 3}, new long[] {0, 1, 1, 2, 3, 5, 8});
  }
}
