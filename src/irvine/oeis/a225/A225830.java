package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225830 Number of binary pattern classes in the <code>(6</code>,n)-rectangular grid: two patterns are in the same class if one of them can be obtained by a reflection or 180-degree rotation of the other.
 * @author Sean A. Irvine
 */
public class A225830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225830() {
    super(new long[] {-4096, 64, 64}, new long[] {1, 36, 1072});
  }
}
