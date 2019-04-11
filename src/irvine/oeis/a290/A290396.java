package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290396 <code>a(n) = 3*2^n + 3*4^n + 6^(n+1) + 1</code>.
 * @author Sean A. Irvine
 */
public class A290396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290396() {
    super(new long[] {-48, 92, -56, 13}, new long[] {13, 55, 277, 1513});
  }
}
