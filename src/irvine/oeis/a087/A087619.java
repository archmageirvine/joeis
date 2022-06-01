package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087619 a(n) = 137*a(n-1) + a(n-2), with a(0) = 2 and a(1) = 137.
 * @author Sean A. Irvine
 */
public class A087619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087619() {
    super(new long[] {1, 137}, new long[] {2, 137});
  }
}
