package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292277 a(n) = 2^n*F(n)*F(n+1), where F = A000045.
 * @author Sean A. Irvine
 */
public class A292277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292277() {
    super(new long[] {-8, 8, 4}, new long[] {0, 2, 8});
  }
}
