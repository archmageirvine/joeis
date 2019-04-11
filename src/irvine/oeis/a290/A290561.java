package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290561 <code>a(n) = n +</code> cos(n*Pi/2).
 * @author Sean A. Irvine
 */
public class A290561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290561() {
    super(new long[] {-1, 2, -2, 2}, new long[] {1, 1, 1, 3});
  }
}
