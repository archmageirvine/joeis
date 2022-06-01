package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081554 a(n) = sqrt(2)*( (3+2*sqrt(2))^n - (3-2*sqrt(2))^n ).
 * @author Sean A. Irvine
 */
public class A081554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081554() {
    super(new long[] {-1, 6}, new long[] {0, 8});
  }
}
