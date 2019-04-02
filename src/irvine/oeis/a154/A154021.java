package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154021 a(n+2) = 16*a(n+1) - a(n), with a(1)=0, a(2)=4.
 * @author Sean A. Irvine
 */
public class A154021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154021() {
    super(new long[] {-1, 16}, new long[] {0, 4});
  }
}
