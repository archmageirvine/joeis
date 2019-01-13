package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041203.
 * @author Sean A. Irvine
 */
public class A041203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041203() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 254, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 5, 7, 12, 247, 259, 506, 1271, 1777, 3048});
  }
}
