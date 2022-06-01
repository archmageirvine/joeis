package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101362 a(n) = (n+1)*n^4.
 * @author Sean A. Irvine
 */
public class A101362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101362() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 2, 48, 324, 1280, 3750});
  }
}
