package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014936 a(1)=1, a(n) = n*19^(n-1) + a(n-1).
 * @author Sean A. Irvine
 */
public class A014936 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014936() {
    super(1, new long[] {361, -399, 39}, new long[] {1, 39, 1122});
  }
}
