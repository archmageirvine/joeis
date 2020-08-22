package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225827 Number of binary pattern classes in the (3,n)-rectangular grid: two patterns are in same class if one of them can be obtained by a reflection or 180 degree rotation of the other.
 * @author Sean A. Irvine
 */
public class A225827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225827() {
    super(new long[] {256, -96, -24, 12}, new long[] {1, 6, 24, 168});
  }
}
