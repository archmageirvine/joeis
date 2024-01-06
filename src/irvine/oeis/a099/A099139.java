package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099139 a(n) = (18^n - (-6)^n)/24.
 * @author Sean A. Irvine
 */
public class A099139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099139() {
    super(new long[] {108, 12}, new long[] {0, 1});
  }
}
