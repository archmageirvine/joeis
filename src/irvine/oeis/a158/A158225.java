package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158225 a(n) = 196*n - 1.
 * @author Sean A. Irvine
 */
public class A158225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158225() {
    super(1, new long[] {-1, 2}, new long[] {195, 391});
  }
}
