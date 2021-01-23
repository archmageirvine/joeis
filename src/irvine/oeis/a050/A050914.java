package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050914 a(n) = n*3^n + 1.
 * @author Sean A. Irvine
 */
public class A050914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050914() {
    super(new long[] {9, -15, 7}, new long[] {1, 4, 19});
  }
}
