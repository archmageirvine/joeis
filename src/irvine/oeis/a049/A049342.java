package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049342 a(n) = A049341(n)/3.
 * @author Sean A. Irvine
 */
public class A049342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049342() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 2, 2, 1, 3, 1});
  }
}
