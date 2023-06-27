package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134752 a(n) = 3^(2*n-1) + 2.
 * @author Sean A. Irvine
 */
public class A134752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134752() {
    super(1, new long[] {-9, 10}, new long[] {5, 29});
  }
}
