package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126392 Number of base 5 n-digit numbers with adjacent digits differing by two or less.
 * @author Sean A. Irvine
 */
public class A126392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126392() {
    super(new long[] {-1, 0, 4}, new long[] {1, 5, 19});
  }
}
