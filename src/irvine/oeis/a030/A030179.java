package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030179 Quarter-squares squared: A002620^2.
 * @author Sean A. Irvine
 */
public class A030179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030179() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 1, 4, 16, 36, 81, 144});
  }
}
