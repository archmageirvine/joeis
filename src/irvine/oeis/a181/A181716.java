package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181716 a(n) = a(n-1) + a(n-2) + (-1)^n, with a(0)=0 and a(1)=1.
 * @author Sean A. Irvine
 */
public class A181716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181716() {
    super(new long[] {1, 2, 0}, new long[] {0, 1, 2});
  }
}
