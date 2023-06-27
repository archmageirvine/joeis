package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027820 a(n) = 28*(n+1)*binomial(n+6,8)/3.
 * @author Sean A. Irvine
 */
public class A027820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027820() {
    super(2, new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {28, 336, 2100, 9240, 32340, 96096, 252252, 600600, 1321320, 2722720});
  }
}
