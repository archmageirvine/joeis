package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103142 a(n) = 2*a(n-1) + a(n-2) + a(n-3) + a(n-4), with a(0)=1, a(1)=2, a(3)=5, a(4)=13.
 * @author Sean A. Irvine
 */
public class A103142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103142() {
    super(new long[] {1, 1, 1, 2}, new long[] {1, 2, 5, 13});
  }
}
