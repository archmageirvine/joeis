package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199763 a(n) = 9*11^n+1.
 * @author Sean A. Irvine
 */
public class A199763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199763() {
    super(new long[] {-11, 12}, new long[] {10, 100});
  }
}
