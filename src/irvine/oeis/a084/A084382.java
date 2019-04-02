package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084382 a(n) = n^3 + 6.
 * @author Sean A. Irvine
 */
public class A084382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084382() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 7, 14, 33});
  }
}
