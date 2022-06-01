package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135248 a(n) = 4*a(n-1) - 4*a(n-2) + 2*a(n-4), with a(0)=a(1)=a(2)=0, and a(3)=1.
 * @author Sean A. Irvine
 */
public class A135248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135248() {
    super(new long[] {2, 0, -4, 4}, new long[] {0, 0, 0, 1});
  }
}
