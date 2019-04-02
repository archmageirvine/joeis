package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005710 a(n) = a(n-1) + a(n-8), with a(i) = 1 for i = 0..7.
 * @author Sean A. Irvine
 */
public class A005710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005710() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1});
  }
}

