package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087798 a(n) = 9*a(n-1) + a(n-2), starting with a(0) = 2 and a(1) = 9.
 * @author Sean A. Irvine
 */
public class A087798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087798() {
    super(new long[] {1, 9}, new long[] {2, 9});
  }
}
