package irvine.oeis.a001;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A001644 a(n) = a(n-1) + a(n-2) + a(n-3), a(0)=3, a(1)=1, a(2)=3.
 * @author Sean A. Irvine
 */
public class A001644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001644() {
    super(new long[] {1, 1, 1}, new long[] {3, 1, 3});
  }
}
