package irvine.oeis.a004;

import irvine.oeis.LinearRecurrence;

/**
 * A004253 a(n) = 5*a(n-1) - a(n-2), with a(1)=1, a(2)=4.
 * @author Sean A. Irvine
 */
public class A004253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A004253() {
    super(new long[]{-1, 5}, new long[] {1, 4});
  }
}
