package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098182 a(n) = 3*a(n-1) - a(n-2) + a(n-3), a(0)=1,a(1)=1,a(2)=3.
 * @author Sean A. Irvine
 */
public class A098182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098182() {
    super(new long[] {1, -1, 3}, new long[] {1, 1, 3});
  }
}
