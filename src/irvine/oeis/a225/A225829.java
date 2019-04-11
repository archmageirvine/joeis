package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225829 Number of binary pattern classes in the <code>(5</code>,n)-rectangular grid: two patterns are in the same class if one of them can be obtained by a reflection or 180 degree rotation of the other.
 * @author Sean A. Irvine
 */
public class A225829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225829() {
    super(new long[] {8192, -1280, -224, 40}, new long[] {1, 20, 288, 8640});
  }
}
