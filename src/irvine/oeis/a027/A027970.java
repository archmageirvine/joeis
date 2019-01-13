package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027970.
 * @author Sean A. Irvine
 */
public class A027970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027970() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 4, 11, 29, 76, 196, 487, 1148, 2552});
  }
}
