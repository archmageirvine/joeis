package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218752 a(n) = (50^n-1)/49.
 * @author Sean A. Irvine
 */
public class A218752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218752() {
    super(new long[] {-50, 51}, new long[] {0, 1});
  }
}
