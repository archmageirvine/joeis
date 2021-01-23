package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048495 a(n) = (n-1)*2^n + 2.
 * @author Sean A. Irvine
 */
public class A048495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048495() {
    super(new long[] {4, -8, 5}, new long[] {1, 2, 6});
  }
}
