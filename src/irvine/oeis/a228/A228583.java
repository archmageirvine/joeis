package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228583 The number of binary pattern classes in the <code>(2</code>,n)-rectangular grid with 8 '1's and <code>(2n-8)</code> '0's: two patterns are in same class if one of them can be obtained by a reflection or 180-degree rotation of the other.
 * @author Sean A. Irvine
 */
public class A228583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228583() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 0, 0, 0, 1, 15, 135, 777, 3270});
  }
}
