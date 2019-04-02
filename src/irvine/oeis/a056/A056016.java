package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056016 a(n) = -2*a(n - 1) -a(n - 2) -a(n - 3), a(0) = a(1) = a(2) = 1.
 * @author Sean A. Irvine
 */
public class A056016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056016() {
    super(new long[] {-1, -1, -2}, new long[] {1, 1, 1});
  }
}
