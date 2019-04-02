package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052161 Partial sums of A014825, second partial sums of A002450.
 * @author Sean A. Irvine
 */
public class A052161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052161() {
    super(new long[] {-4, 13, -15, 7}, new long[] {1, 7, 34, 146});
  }
}
