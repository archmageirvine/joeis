package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225834 Number of binary pattern classes in the <code>(10,n)-rectangular</code> grid: two patterns are in the same class if one of them can be obtained by a reflection or 180-degree rotation of the other.
 * @author Sean A. Irvine
 */
public class A225834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225834() {
    super(new long[] {-1048576, 1024, 1024}, new long[] {1, 528, 262912});
  }
}
