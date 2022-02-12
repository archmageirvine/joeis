package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175976 a(n) = 4^n-3*n+1.
 * @author Sean A. Irvine
 */
public class A175976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175976() {
    super(new long[] {4, -9, 6}, new long[] {2, 2, 11});
  }
}
