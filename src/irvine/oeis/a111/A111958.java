package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111958 Lucas numbers <code>(A000032) mod 8</code>.
 * @author Sean A. Irvine
 */
public class A111958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111958() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {2, 1, 3, 4, 7, 3, 2, 5, 7, 4, 3});
  }
}
