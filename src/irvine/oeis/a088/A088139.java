package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088139 a(n) = 2*a(n-1) - 6*a(n-2), a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A088139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088139() {
    super(new long[] {-6, 2}, new long[] {0, 1});
  }
}
