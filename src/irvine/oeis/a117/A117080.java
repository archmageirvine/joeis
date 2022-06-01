package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117080 a(n) = 2a(n-1)+a(n-3)+1 with a(1)=1, a(2)=3, a(3)=8.
 * @author Sean A. Irvine
 */
public class A117080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117080() {
    super(new long[] {-1, 1, -2, 3}, new long[] {1, 3, 8, 18});
  }
}
