package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214297 a(0)=-1, a(1)=0, a(2)=-3; thereafter a(n+2) - 2*a(n+1) + a(n) has period 4: repeat -4, 8, -4, 2.
 * @author Sean A. Irvine
 */
public class A214297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214297() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {-1, 0, -3, 2, 3, 6});
  }
}
