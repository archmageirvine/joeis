package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243208.
 * @author Sean A. Irvine
 */
public class A243208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243208() {
    super(new long[] {1, -3, 0, 7, -3, -6, 0, 6, 3, -7, 0, 3}, new long[] {0, 3, 20, 77, 223, 552, 1196, 2380, 4388, 7657, 12710, 20301});
  }
}
