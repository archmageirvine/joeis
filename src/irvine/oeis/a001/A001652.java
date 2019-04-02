package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001652 a(n) = 6*a(n-1) - a(n-2) + 2 with a(0) = 0, a(1) = 3.
 * @author Sean A. Irvine
 */
public class A001652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001652() {
    super(new long[] {1, -7, 7}, new long[] {0, 3, 20});
  }
}
