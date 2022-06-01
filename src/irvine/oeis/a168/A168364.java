package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168364 a(n) = n^5*(n^2 + 1)/2.
 * @author Sean A. Irvine
 */
public class A168364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168364() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 80, 1215, 8704, 40625, 143856, 420175});
  }
}
