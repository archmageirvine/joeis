package irvine.oeis.a222;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A222715 The number of binary pattern classes in the (2,n)-rectangular grid with 5 '1's and (2n-5) '0's: two patterns are in same class if one of them can be obtained by a reflection or 180-degree rotation of the other.
 * @author Sean A. Irvine
 */
public class A222715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222715() {
    super(new long[] {-1, 3, 0, -8, 6, 6, -8, 0, 3}, new long[] {2, 14, 66, 198, 508, 1092, 2156, 3876, 6606});
  }
}
