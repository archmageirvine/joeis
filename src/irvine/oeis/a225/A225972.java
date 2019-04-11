package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225972 The number of binary pattern classes in the <code>(2</code>,n)-rectangular grid with 3 '1's and <code>(2n-3)</code> '0's: two patterns are in same class if one of them can be obtained by a reflection or 180-degree rotation of the other.
 * @author Sean A. Irvine
 */
public class A225972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225972() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 0, 1, 6, 14, 32});
  }
}
