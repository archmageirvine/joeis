package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081410 a(n) = a(n-1) + a(n-2) + n (mod 3), with a(1)=a(2)=1.
 * @author Sean A. Irvine
 */
public class A081410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081410() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {1, 1, 2, 4, 8});
  }
}
