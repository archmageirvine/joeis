package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282703 a(n) = 3*a(n-1) + a(n-2), with a(0)=7, a(1)=26.
 * @author Sean A. Irvine
 */
public class A282703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282703() {
    super(new long[] {1, 3}, new long[] {7, 26});
  }
}
