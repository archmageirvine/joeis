package irvine.oeis.a225;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A225831 Number of binary pattern classes in the (7,n)-rectangular grid: two patterns are in the same class if one of them can be obtained by a reflection or 180-degree rotation of the other.
 * @author Sean A. Irvine
 */
public class A225831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225831() {
    super(new long[] {262144, -18432, -1920, 144}, new long[] {1, 72, 4224, 529920});
  }
}
