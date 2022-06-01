package irvine.oeis.a225;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A225833 Number of binary pattern classes in the (9,n)-rectangular grid: two patterns are in the same class if one of them can be obtained by a reflection or 180-degree rotation of the other.
 * @author Sean A. Irvine
 */
public class A225833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225833() {
    super(new long[] {8388608, -278528, -15872, 544}, new long[] {1, 272, 66048, 33632256});
  }
}
