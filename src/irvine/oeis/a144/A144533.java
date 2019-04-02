package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144533 Numerators of continued fraction convergents to sqrt(8/9).
 * @author Sean A. Irvine
 */
public class A144533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144533() {
    super(new long[] {-1, 0, 34, 0}, new long[] {0, 1, 16, 33});
  }
}
