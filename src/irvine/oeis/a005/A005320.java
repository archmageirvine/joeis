package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005320 a(n) = 4*a(n-1) - a(n-2), with a(0) = 0, a(1) = 3.
 * @author Sean A. Irvine
 */
public class A005320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005320() {
    super(new long[] {-1, 4}, new long[] {0, 3});
  }
}
