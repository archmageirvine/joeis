package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126528 Number of base 7 n-digit numbers with adjacent digits differing by five or less.
 * @author Sean A. Irvine
 */
public class A126528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126528() {
    super(new long[] {5, 6}, new long[] {1, 7});
  }
}
