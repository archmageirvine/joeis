package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181586 a(0)=0; a(n+1) = 2*a(n) + period 4:repeat 0,1,-2,1.
 * @author Sean A. Irvine
 */
public class A181586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181586() {
    super(new long[] {2, 1, 1, 1}, new long[] {0, 0, 1, 0});
  }
}
