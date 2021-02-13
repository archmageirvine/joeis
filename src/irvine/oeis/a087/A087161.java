package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087161 Records in A087159, i.e., A087159(a(n)) = n, and satisfies the recurrence a(n+3) = 5*a(n+2) - 6* a(n+1) + 2*a(n) with a(1) = 1, a(2) = 2, and a(3) = 4.
 * @author Sean A. Irvine
 */
public class A087161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087161() {
    super(new long[] {2, -6, 5}, new long[] {1, 2, 4});
  }
}
