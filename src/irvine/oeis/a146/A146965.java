package irvine.oeis.a146;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A146965 a(n) = 10*a(n-1) - 18*a(n-2) with a(0)=1, a(1)=5.
 * @author Sean A. Irvine
 */
public class A146965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146965() {
    super(new long[] {-18, 10}, new long[] {1, 5});
  }
}
