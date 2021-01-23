package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146962 a(n) = 10*a(n-1) - 19*a(n-2) with a(0)=1, a(1)=5.
 * @author Sean A. Irvine
 */
public class A146962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146962() {
    super(new long[] {-19, 10}, new long[] {1, 5});
  }
}
