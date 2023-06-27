package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135332 a(1)=1; for n&gt;1, a(n) = a(n-1) + n^0 if n odd, a(n) = a(n-1) + n^3 if n is even.
 * @author Sean A. Irvine
 */
public class A135332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135332() {
    super(1, new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {1, 9, 10, 74, 75, 291, 292, 804, 805});
  }
}
