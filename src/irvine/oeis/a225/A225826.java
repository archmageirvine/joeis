package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225826 Number of binary pattern classes in the <code>(2,n)-rectangular</code> grid: two patterns are in same class if one of them can be obtained by a reflection or 180-degree rotation of the other.
 * @author Sean A. Irvine
 */
public class A225826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225826() {
    super(new long[] {-16, 4, 4}, new long[] {1, 3, 7});
  }
}
