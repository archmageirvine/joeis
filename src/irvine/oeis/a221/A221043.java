package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221043.
 * @author Sean A. Irvine
 */
public class A221043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221043() {
    super(new long[] {19683, -45927, 40095, -17523, 4185, -549, 37}, new long[] {10, 457, 11788, 223306, 3527782, 49658659, 646456696});
  }
}
