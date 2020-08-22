package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124720 Number of ternary Lyndon words of length n with exactly two 1's.
 * @author Sean A. Irvine
 */
public class A124720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124720() {
    super(new long[] {8, -8, -2, 4}, new long[] {2, 5, 16, 38});
  }
}
