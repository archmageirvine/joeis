package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225832 Number of binary pattern classes in the (8,n)-rectangular grid: two patterns are in the same class if one of them can be obtained by a reflection or 180-degree rotation of the other.
 * @author Sean A. Irvine
 */
public class A225832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225832() {
    super(new long[] {-65536, 256, 256}, new long[] {1, 136, 16576});
  }
}
