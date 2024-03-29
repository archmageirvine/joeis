package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099855 a(n) = n*2^n - 2^(n/2)*sin(Pi*n/4).
 * @author Sean A. Irvine
 */
public class A099855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099855() {
    super(new long[] {-8, 16, -14, 6}, new long[] {0, 1, 6, 22});
  }
}
