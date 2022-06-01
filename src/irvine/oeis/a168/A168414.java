package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168414 a(n) = (18*n - 9*(-1)^n - 3)/4.
 * @author Sean A. Irvine
 */
public class A168414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168414() {
    super(new long[] {-1, 1, 1}, new long[] {6, 6, 15});
  }
}
