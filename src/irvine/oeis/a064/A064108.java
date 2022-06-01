package irvine.oeis.a064;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A064108 a(n) = (20^n-1)/19.
 * @author Sean A. Irvine
 */
public class A064108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064108() {
    super(new long[] {-20, 21}, new long[] {0, 1});
  }
}
