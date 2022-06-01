package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253852 a(n) = a(n-4) * (a(n-3) + a(n-1)) / a(n-3), with a(0) = a(1) = a(2) = a(3) = 1.
 * @author Sean A. Irvine
 */
public class A253852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253852() {
    super(new long[] {12, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 2, 3, 4, 3, 4, 6});
  }
}
