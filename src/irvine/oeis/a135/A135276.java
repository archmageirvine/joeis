package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135276 a(0)=0, a(1)=1; for n&gt;1, a(n) = a(n-1) + n^0 if n odd, a(n) = a(n-1) + n^1 if n is even.
 * @author Sean A. Irvine
 */
public class A135276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135276() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 3, 4, 8});
  }
}
