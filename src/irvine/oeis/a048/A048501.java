package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048501 a(n) = 2^(n-1)*(8*n-14)+8.
 * @author Sean A. Irvine
 */
public class A048501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048501() {
    super(new long[] {4, -8, 5}, new long[] {1, 2, 12});
  }
}
