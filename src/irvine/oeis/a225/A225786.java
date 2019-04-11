package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225786 Numbers k such that oblong(2*k) + oblong(k) is a square, where oblong(k) = A002378(k) <code>= k*(k+1)</code>.
 * @author Sean A. Irvine
 */
public class A225786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225786() {
    super(new long[] {1, -323, 323}, new long[] {0, 48, 15552});
  }
}
