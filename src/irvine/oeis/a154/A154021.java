package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154021 a(n+2) = 16*a(n+1) - a(n), with a(1)=0, a(2)=4.
 * @author Sean A. Irvine
 */
public class A154021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154021() {
    super(1, new long[] {-1, 16}, new long[] {0, 4});
  }
}
