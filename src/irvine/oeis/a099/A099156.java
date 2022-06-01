package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099156 a(n) = 2^(n-1)*U(n-1, 2).
 * @author Sean A. Irvine
 */
public class A099156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099156() {
    super(new long[] {-4, 8}, new long[] {0, 1});
  }
}
