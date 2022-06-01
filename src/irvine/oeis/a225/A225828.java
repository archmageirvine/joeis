package irvine.oeis.a225;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A225828 Number of binary pattern classes in the (4,n)-rectangular grid: two patterns are in the same class if one of them can be obtained by a reflection or 180-degree rotation of the other.
 * @author Sean A. Irvine
 */
public class A225828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225828() {
    super(new long[] {-256, 16, 16}, new long[] {1, 10, 76});
  }
}
