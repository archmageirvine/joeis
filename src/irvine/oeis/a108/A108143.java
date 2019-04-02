package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108143 a(n)= 5*a(n-1) -a(n-2) -a(n-3).
 * @author Sean A. Irvine
 */
public class A108143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108143() {
    super(new long[] {-1, -1, 5}, new long[] {1, 1, 1});
  }
}
