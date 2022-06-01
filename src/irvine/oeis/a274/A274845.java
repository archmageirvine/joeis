package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274845 a(0)=1, a(1)=0, a(4n+2) = a(4n+3) = a(4n+5) = (4^(n+1) +(-1)^n)/5, a(4n+4) = (2*4^(n+1) -3*(-1)^n)/5.
 * @author Sean A. Irvine
 */
public class A274845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274845() {
    super(new long[] {4, 0, 0, 0, 3, 0, 0, 0}, new long[] {1, 0, 1, 1, 1, 1, 3, 3});
  }
}
