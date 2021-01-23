package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051870 18-gonal (or octadecagonal) numbers: a(n) = n*(8*n-7).
 * @author Sean A. Irvine
 */
public class A051870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051870() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 18});
  }
}
