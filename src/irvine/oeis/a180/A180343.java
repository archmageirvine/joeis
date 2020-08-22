package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180343 a(0)=-4; a(n+1) = 2*a(n) + period 4: repeat 6,1,2,5.
 * @author Sean A. Irvine
 */
public class A180343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180343() {
    super(new long[] {-2, 1, 0, 0, 2}, new long[] {-4, -2, -3, -4, -3});
  }
}
