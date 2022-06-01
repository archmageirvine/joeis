package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099430 2^n+(-1)^n-1.
 * @author Sean A. Irvine
 */
public class A099430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099430() {
    super(new long[] {-2, 1, 2}, new long[] {1, 0, 4});
  }
}
