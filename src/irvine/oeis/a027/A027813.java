package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027813 a(n) = 14*(n+1)*binomial(n+5,8).
 * @author Sean A. Irvine
 */
public class A027813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027813() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {56, 630, 3780, 16170, 55440, 162162, 420420, 990990, 2162160, 4424420});
  }
}
