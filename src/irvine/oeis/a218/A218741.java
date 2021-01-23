package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218741 a(n) = (38^n-1)/37.
 * @author Sean A. Irvine
 */
public class A218741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218741() {
    super(new long[] {-38, 39}, new long[] {0, 1});
  }
}
